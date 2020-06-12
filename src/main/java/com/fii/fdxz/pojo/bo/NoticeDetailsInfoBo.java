package com.fii.fdxz.pojo.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author wangp
 * @Date 2020/6/12
 * @Version 1.0
 */
@Data
@ApiModel("通知详情实体类")
public class NoticeDetailsInfoBo {
    @ApiModelProperty("通知id")
    private String id;
    @ApiModelProperty("通知标题")
    private String title;
    @ApiModelProperty("通知正文")
    private String content;
    @ApiModelProperty("附件")
    private String attachment;
    @ApiModelProperty("优先级")
    private String level;
    @ApiModelProperty("提醒策略")
    private String mode;
//    @ApiModelProperty("发布人")
//    private String publisher;
    @ApiModelProperty("接受对象")
    private String sendTo;
    @ApiModelProperty("通知类别")
    private Integer status;
    @ApiModelProperty("通知时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime sendTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("学生提问截止时间")
    private LocalDateTime questionEndTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("通知创建时间")
    private LocalDateTime createTime;
    @ApiModelProperty("学生确认率")
    private double confirmRate;
    @ApiModelProperty("未确认通知学生")
    private List<String> noConfirmStudent;
    @ApiModelProperty("已确认通知学生")
    private List<String> confirmStudent;
}
