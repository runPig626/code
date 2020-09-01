package com.taigu.code.eunm;

import com.taigu.code.exception.BusinessExceptionAssert;

/**
 * @author Administrator
 */
public enum ResponseEnum implements BusinessExceptionAssert {
    ;

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
