package com.fii.fdxz.controller;

import com.fii.fdxz.common.base.Result;
import com.fii.fdxz.service.NoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wangp
 * @Date 2020/5/27
 * @Version 1.0
 */
@RestController
@RequestMapping("/notice")
@Api(tags = "通知操作接口")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @GetMapping("query")
    @ApiOperation("查询通知(列表页)")
    public Result queryProfileNotice() {
        return Result.success(noticeService.queryNoticeByProfile());
    }
}
