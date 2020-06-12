package com.fii.fdxz.common.util;

/**
 * @author Anthony
 * @date 2019/11/12
 */
public final class Mappers {
    private Mappers() {}

    /**
     * 判断多个查询是否成功
     */
    public static boolean success(int... modifyArray) {
        for (int modify : modifyArray) {
            if (modify <= 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断查询是否成功
     * @param modify 修改个数
     * @param total 总数
     */
    public static boolean success(int modify, int total) {
        return modify == total;
    }

    /**
     * 判断存在
     */
    public static boolean exist(int count) {
        return count > 0;
    }

    /**
     * 判断不存在
     */
    public static boolean notExist(int count) {
        return count < 0;
    }

    /**
     * 判断多个查询是否失败
     */
    public static boolean failed(int... modifyArray) {
        for (int modify : modifyArray) {
            if (modify <= 0) {
                return true;
            }
        }
        return false;
    }
}
