package com.fii.fdxz.pojo.po;

import lombok.Data;

/**
 * @Author wangp
 * @Date 2020/6/12
 * @Version 1.0
 */
@Data
public class NoticeConfirmInfo {
    private Integer id;
    private String noticeId;
    private String studentId;
    private String gradeId;
    private Integer status;
}
