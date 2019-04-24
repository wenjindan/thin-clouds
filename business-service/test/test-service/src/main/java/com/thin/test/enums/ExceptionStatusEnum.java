package com.thin.test.enums;

import com.thin.base.common.interfaces.BaseExceptionEnumInterface;

public enum ExceptionStatusEnum implements BaseExceptionEnumInterface {

    TEST_ENUM(101,"测试");

    private int errorCode;
    private String errorMassage;

    ExceptionStatusEnum(int errorCode, String errorMassage) {
        this.errorCode = errorCode;
        this.errorMassage = errorMassage;
    }

    @Override
    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMassage() {
        return errorMassage;
    }
}
