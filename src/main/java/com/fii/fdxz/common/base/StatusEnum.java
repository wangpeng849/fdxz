package com.fii.fdxz.common.base;

/**
 * @author Anthony
 * @date 2019/11/1
 * 状态码枚举，只提供常用状态码；如非必要，尽量少定义特殊状态码
 */
public enum StatusEnum {
    /**
     * 成功
     */
    SUCCESS(1),
    /**
     * 失败
     */
    FAIL(0),
    /**
     * 错误
     */
    ERROR(400),
    /**
     * 未登录
     */
    NOT_LOGIN(401);

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    StatusEnum(int code) {
        this.code = code;
    }

}
