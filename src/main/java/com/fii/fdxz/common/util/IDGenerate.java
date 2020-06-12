package com.fii.fdxz.common.util;

import java.util.UUID;

/**
 * @author Anthony
 * @date 2019/11/12
 */
public final class IDGenerate {
    private IDGenerate() {}

    public static String id() {
        return uuid();
    }

    public static String uuid() {
        return UUID.randomUUID()
                .toString()
                .replace("-", "");
    }
}
