package com.fii.fdxz.common.util;

import com.fii.fdxz.common.base.MessageEnum;
import com.fii.fdxz.common.base.Result;
import com.fii.fdxz.common.base.StatusEnum;

/**
 * @Author wangp
 * @Date 2020/6/11
 * @Version 1.0
 */
public class CommonUtils {

    public static Result validPwd(String pwd) {
        if (pwd.length() < 6 || pwd.length() > 30) {
            return Result.error(MessageEnum.PASSWORD_LENGTH_ERROR);
        }
        int count = 0;
        if (pwd.matches(".*\\d+.*")) {
            count++;
        }
        if (pwd.matches(".*[a-zA-Z]+.*")) {
            count++;
        }
        if (pwd.matches(".*[@#！%*&._\\-+/？?!]+.*")) {
            count++;
        }
//        if (pwd.replaceAll("\\d", "").replaceAll("[a-zA-Z]", "").replaceAll("[@#！%*&._\\-+/？?!]", "").length() != 0) {
//            return Result.error(MessageEnum.PASSWORD_FORMAT_ERROR);
//        }
        if (count < 2) {
            return Result.error(MessageEnum.PASSWORD_FORMAT_ERROR);
        }
        return null;
    }
}
