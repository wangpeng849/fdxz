package com.fii.fdxz.common.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @Author wangp
 * @Date 2020/5/14
 * @Version 1.0
 */
public class TimeUtils {

    /**
     * 获取当前时间戳
     * @return
     */
    public static Long getCurrentTimeMills(){
        return LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
    }
}
