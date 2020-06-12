package com.fii.fdxz.controller;

import com.fii.fdxz.common.base.Result;
import com.fii.fdxz.pojo.bo.StudentInfoBo;
import com.fii.fdxz.pojo.bo.StudentLoginBo;
import com.fii.fdxz.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author wangp
 * @Date 2020/5/26
 * @Version 1.0
 */
@RestController
@RequestMapping("/stu")
@Api(tags = "学生接口")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    @ApiOperation("查询学生列表")
    public Result<List<StudentInfoBo>> queryStudentList(){
        return Result.success(studentService.queryStudentList());
    }

    @PostMapping("/login")
    @ApiOperation("学生登录")
    public Result studentLogin(@ApiParam(value = "用户登录信息")  @RequestBody @Validated StudentLoginBo studentLoginBo){
        return Result.success(studentLoginBo);
    }
}
