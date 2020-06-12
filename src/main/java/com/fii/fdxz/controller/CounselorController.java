package com.fii.fdxz.controller;

import com.fii.fdxz.common.base.Result;
import com.fii.fdxz.service.CounselorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wangp
 * @Date 2020/5/26
 * @Version 1.0
 */
@RestController
@RequestMapping("/cou")
public class CounselorController {

    @Autowired
    private CounselorService counselorService;

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("pub/notice")
    public Result publishNotice(){
        return Result.success("");
    }
}


