package com.taigu.code.asserts.base;

import com.taigu.code.exception.base.BaseException;

/**
 * 自定义断言接口
 * @author Administrator
 */
public interface BaseAssert {

    /**
     * 创建异常
     * @param args
     * @return
     */
    BaseException newException(Object... args);

    /**
     * 断言对象<code>obj<code/>非空。
     * 如果为空则抛出异常
     * @param obj
     */
    void assertNotNull(Object obj);

}
