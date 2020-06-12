package com.fii.fdxz.service;

import com.fii.fdxz.pojo.bo.NoticeProfileInfoBo;

import java.util.List;

/**
 * @Author wangp
 * @Date 2020/5/27
 * @Version 1.0
 */
public interface NoticeService {
    List<NoticeProfileInfoBo> queryNoticeByProfile();
}
