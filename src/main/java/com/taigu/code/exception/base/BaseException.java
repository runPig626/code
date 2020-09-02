package com.taigu.code.exception.base;

import com.taigu.code.eunm.base.BaseEnum;

/**
 * 基本异常
 * @author Administrator
 */
public class BaseException extends RuntimeException{

    /** 错误信息 */
    private String message;

    /** 枚举信息 */
    private BaseEnum responseEnum;


    public BaseException(BaseEnum responseEnum, String message) {
        this.responseEnum = responseEnum;
        this.message = message;
    }

    @Override
    public String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("code: ").append(responseEnum.getCode())
                    .append(", message: ").append(message);
        return stringBuffer.toString();
    }

}
