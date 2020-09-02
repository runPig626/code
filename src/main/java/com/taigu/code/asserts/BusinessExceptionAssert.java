package com.taigu.code.asserts;

import com.taigu.code.asserts.base.BaseAssert;
import com.taigu.code.eunm.base.BaseEnum;
import com.taigu.code.exception.BusinessException;
import com.taigu.code.exception.base.BaseException;

import java.text.MessageFormat;

/**
 * @author Administrator
 */
public interface BusinessExceptionAssert extends BaseEnum, BaseAssert {

    /**
     * 创建异常
     * @param args
     * @return
     */
    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, msg);
    }

    /**
     * 断言为空
     * @param obj
     */
    @Override
    default void assertNotNull(Object obj){
        if (null == obj){
            throw newException((Object) null);
        }
    }

}
