package com.fii.fdxz.common.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Anthony
 * @date 2019/11/1
 */
@Getter
@Setter
@ToString
@SuppressWarnings({"unused"})
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -3112312837157440313L;
    private int status;
    private String message;
    private T payload;

    private Result(StatusEnum statusEnum) {
        this.status = statusEnum.getCode();
    }

    private Result(StatusEnum statusEnum, String message, T payload) {
        this.status = statusEnum.getCode();
        this.message = message;
    }


    private Result(StatusEnum statusEnum, T payload) {
        this.status = statusEnum.getCode();
        this.payload = payload;
    }

    public static Result<Boolean> failed() {
        return new Result<>(StatusEnum.FAIL, false);
    }

    public static <T> Result<T> success(T payload) {
        return new Result<>(StatusEnum.SUCCESS, payload);
    }

    public static <T> Result<T> error(String message) {
        return new Result(StatusEnum.ERROR, message, false);
    }

    public static <T> Result<T> error(MessageEnum message) {
        return new Result(StatusEnum.FAIL, message.getMessage(), false);
    }

}
