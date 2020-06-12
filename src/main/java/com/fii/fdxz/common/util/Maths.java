package com.fii.fdxz.common.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Anthony
 * @date 2020/4/27
 */
public final class Maths {
    private Maths() {}

    /**
     * 四舍五入
     */
    public static double round(double value, int scale) {
        BigDecimal bd = new BigDecimal(value);
        return bd.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 除法并四舍五入
     */
    public static double divide(double d1, double d2, int scale) {
        BigDecimal bd1 = new BigDecimal(d1);
        BigDecimal bd2 = new BigDecimal(d2);
        return bd1.divide(bd2, scale, RoundingMode.HALF_UP).doubleValue();
    }

}
