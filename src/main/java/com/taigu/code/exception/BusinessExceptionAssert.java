package com.taigu.code.exception;

import com.taigu.code.eunm.IResponseEnum;
import com.taigu.code.exception.base.Assert;
import com.taigu.code.exception.base.BaseException;

import java.text.MessageFormat;

/**
 * @author Administrator
 */
public interface BusinessExceptionAssert extends IResponseEnum, Assert {

    /**
     * 创建异常
     * @param args
     * @return
     */
    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg);
    }

    /**
     * 创建异常
     * @param t
     * @param args
     * @return
     */
    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg, t);
    }
}
