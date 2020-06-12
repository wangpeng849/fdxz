package com.fii.fdxz.handler;

import com.fii.fdxz.common.base.MessageEnum;
import com.fii.fdxz.common.base.Result;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Objects;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    /**
     * 要拦截的异常Exception
     */
    @ExceptionHandler(value = Exception.class)
    public Result<String> exceptionHandler(Exception e) {

        if(e instanceof MethodArgumentNotValidException){
            BindingResult bindingResult = ((MethodArgumentNotValidException) e).getBindingResult();
            return Result.error(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        }
        if (e instanceof BindException) {
            e.printStackTrace();//将异常打印出来
            BindException ex = (BindException) e;
            List<ObjectError> allErrors = ex.getAllErrors();
            ObjectError objectError = allErrors.get(0);
            String ms = objectError.getDefaultMessage();
            return Result.error(ms);
        } else {
            e.printStackTrace();
            return Result.error(e.getMessage());
        }
    }
}