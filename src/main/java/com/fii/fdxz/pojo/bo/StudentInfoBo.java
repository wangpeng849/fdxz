package com.fii.fdxz.pojo.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fii.fdxz.common.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author wangp
 * @Date 2020/5/26
 * @Version 1.0
 */
@Data
@ApiModel("学生信息")
public class StudentInfoBo extends BaseDTO {
    @ApiModelProperty("学生id")
    private String id;
    @ApiModelProperty("学生姓名")
    private String name;
    @ApiModelProperty("学号")
    private String studyNumber;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("性别")
    private String sex;
    @ApiModelProperty("手机号")
    private String phone;
    @ApiModelProperty("状态")
    private Integer status;
    @ApiModelProperty("辅导员id")
    private String counselorId;
    @ApiModelProperty("学生类型")
    private String type;
    @ApiModelProperty("班级")
    private String grade;
    @ApiModelProperty("学院")
    private String college;
    @ApiModelProperty("学校")
    private String school;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;
}
