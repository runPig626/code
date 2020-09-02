package com.taigu.code.eunm;

import com.taigu.code.asserts.BusinessExceptionAssert;

/**
 * @author Administrator
 */
public enum BusinessEnum implements BusinessExceptionAssert {
    /** Bad licence type */
    BAD_LICENCE_TYPE(7001,"Bad licence type"),

    /** Licence not found */
    LICENCE_NOT_FOUND(7002, "Licence not found"),

    SHA_WAN_YI(7003, "SHA WAN YI");

    BusinessEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /** 状态码 */
    private int code;

    /** 状态信息 */
    private String message;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
