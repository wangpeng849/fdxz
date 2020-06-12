package com.fii.fdxz.pojo.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @Author wangp
 * @Date 2020/6/11
 * @Version 1.0
 */
@Data
@ApiModel("学生登录")
public class StudentLoginBo {

    @ApiModelProperty("手机号")
    @Pattern(regexp = "^$|^1\\d{10}$",
            message = "手机号：请输入正确手机号")
    @NotBlank(message = "手机号不能为空")
    private String phone;

    @ApiModelProperty("密码")
    @Length(min = 6,max = 16, message = "密码长度只能在6-16之间")
    @NotBlank(message = "密码不能为空")
    private String password;
}
