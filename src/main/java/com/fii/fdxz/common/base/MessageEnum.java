package com.fii.fdxz.common.base;

/**
 * @author Anthony
 * @date 2020/4/27
 */
public enum  MessageEnum {
    NOT_LOGIN("未登录"),
    USER_NOT_EXIST("用户不存在"),
    PARAMETER_ERROR("参数错误"),
    SAVE_FAILED("保存失败"),
    UPDATE_FAILED("更新失败"),
    MAIL_SEND_FAILED("邮件发送失败"),
    PASSWORD_LENGTH_ERROR("密码长度错误"),
    PASSWORD_FORMAT_ERROR("密码由6-16位字符串组成，必须包含数字、字母、符号中至少两种元素。")
    ;
    private String message;

    MessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
