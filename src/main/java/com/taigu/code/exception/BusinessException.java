package com.taigu.code.exception;

import com.taigu.code.eunm.base.BaseEnum;
import com.taigu.code.exception.base.BaseException;

/**
 * @author Administrator
 */
public class BusinessException extends BaseException {
    private static final long serialVersionUID = 1L;

    public BusinessException(BaseEnum responseEnum, String message){
        super(responseEnum, message);
    }

}
