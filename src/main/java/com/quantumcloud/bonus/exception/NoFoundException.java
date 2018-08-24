package com.quantumcloud.bonus.exception;

/**
 * 自定义No Found异常
 * <p>Title: NoFoundExcepiton</p>
 * @author  chenx
 * @date    2018年8月3日 下午3:36:13
 */
public class NoFoundException   extends Exception {

    private static final long serialVersionUID = -5955607821816077172L;

    public NoFoundException (String errorInfo) {
        super(errorInfo);
    }
}
