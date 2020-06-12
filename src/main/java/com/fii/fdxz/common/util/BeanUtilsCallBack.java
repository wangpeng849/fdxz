package com.fii.fdxz.common.util;

/**
 * @Author wangp
 * @Date 2020/6/12
 * @Version 1.0
 */
@FunctionalInterface
public interface BeanUtilsCallBack<S,T> {
    void callback(S s,T t);
}
