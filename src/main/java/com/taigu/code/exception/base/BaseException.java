package com.taigu.code.exception.base;

import com.taigu.code.eunm.IResponseEnum;

/**
 * 基本异常
 * @author Administrator
 */
public class BaseException extends RuntimeException{

    /** 状态码 */
    private String code;

    /** 错误信息 */
    private String message;

    private IResponseEnum responseEnum;

    public BaseException(IResponseEnum responseEnum, Object[] args, String message) {
        this.responseEnum = responseEnum;
        this.message = message;
    }

    public BaseException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        this.responseEnum = responseEnum;
        this.message = message;
    }
}
