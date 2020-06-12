package com.fii.fdxz.common.util;

import com.fii.fdxz.common.base.Result;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.Objects;

/**
 * @author Anthony
 * @date 2019/11/29
 */
public final class Validations {
    private Validations() {}

    public static Result<Boolean> convert(MethodArgumentNotValidException e) {
        if (Objects.isNull(e)) {
            return null;
        }
        return covert(e.getBindingResult());
    }

    public static Result<Boolean> convert(BindException e) {
        return covert(e.getFieldError());
    }

    public static Result<Boolean> covert(FieldError fieldError) {
        if (Objects.isNull(fieldError)) {
            return null;
        }
        return Result.error(fieldError.getDefaultMessage());
    }

    public static Result<Boolean> covert(BindingResult bindingResult) {
        if (Objects.isNull(bindingResult)) {
            return null;
        }
        return covert(bindingResult.getFieldError());
    }
}
