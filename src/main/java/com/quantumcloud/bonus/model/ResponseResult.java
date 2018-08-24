package com.quantumcloud.bonus.model;

/**
 * 返回值实体类
 * <p>Title: ResponseResult</p>
 * @author  chenx
 * @date    2018年8月3日 下午5:23:41
 */
public class ResponseResult {

    private Integer code;

    private boolean result;

    private String msg;

    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public ResponseResult(Integer code, boolean result,String msg, Object data) {
        super();
        this.code = code;
        this.result=result;
        this.msg = msg;
        this.data = data;
    }

}
