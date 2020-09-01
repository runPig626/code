package com.taigu.code.exception.base;

import com.taigu.code.exception.base.BaseException;

/**
 * 自定义断言接口
 * @author Administrator
 */
public interface Assert {

    /**
     * 创建异常
     * @param args
     * @return
     */
    BaseException newException(Object... args);

    /**
     * 创建异常
     * @param t
     * @param args
     * @return
     */
    BaseException newException(Throwable t, Object... args);

    /**
     * 断言对象<code>obj<code/>非空。
     * 如果为空则抛出异常
     * @param obj
     */
    default void assertNotNull(Object obj){
        if (null == obj){
            throw newException(obj);
        }
    }

    /**
     * <p>断言对象<code>obj</code>非空。
     * <p>异常信息<code>message</code>支持传递参数方式，避免在判断之前进行字符串拼接操作
     *
     * @param obj 待判断对象
     * @param args message占位符对应的参数列表
     */
    default void assertNotNull(Object obj, Object... args){
        if (null == obj) {
            throw newException(args);
        }
    }


}
