package com.taigu.code.eunm;

/**
 *
 * @author Administrator
 */
public interface IResponseEnum {
    /**
     * 获取状态码
     * @return
     */
    int getCode();

    /**
     * 获取状态信息
     * @return
     */
    String getMessage();

}
