package com.thin.base.common.vo;


public class BaseResult {
    private String code;
    private String massage;
    private Long timestamp;

    public BaseResult() {
        timestamp=System.currentTimeMillis();
    }

    public BaseResult(String code, String massage) {
        this.code = code;
        this.massage = massage;
        timestamp=System.currentTimeMillis();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
