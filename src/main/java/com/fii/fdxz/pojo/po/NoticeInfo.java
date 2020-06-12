package com.fii.fdxz.pojo.po;

import com.fii.fdxz.common.base.BasePO;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author wangp
 * @Date 2020/6/12
 * @Version 1.0
 */
@Data
public class NoticeInfo {
    private String id;
    private String title;
    private String content;
    private String attachment;
    private String level;
    private String mode;
    private String publisher;
    private String sendTo;
    private Integer status;
    private LocalDateTime sendTime;
    private String taskAttribute;
    private LocalDateTime questionEndTime;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
