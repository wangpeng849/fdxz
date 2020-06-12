package com.fii.fdxz.pojo.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author wangp
 * @Date 2020/6/12
 * @Version 1.0
 */
@Data
@ApiModel("通知查看参数")
public class NoticeQueryDTO {
    @ApiModelProperty("通知标题")
    private String title;
    @ApiModelProperty("通知类别：数字1为已发布，数字0为未发布")
    private Integer status;

}
