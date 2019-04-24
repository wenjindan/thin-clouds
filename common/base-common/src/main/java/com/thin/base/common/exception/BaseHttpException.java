package com.thin.base.common.exception;

import com.thin.base.common.interfaces.BaseExceptionEnumInterface;
import org.springframework.http.HttpStatus;

public class BaseHttpException extends RuntimeException {

    private HttpStatus httpStatus;
    private int projectId;
    private BaseExceptionEnumInterface baseExceptionEnumInterface;

    public BaseHttpException(HttpStatus httpStatus, int projectId, BaseExceptionEnumInterface baseExceptionEnumInterface) {
        super(baseExceptionEnumInterface.getErrorMassage());
        this.httpStatus = httpStatus;
        this.projectId = projectId;
        this.baseExceptionEnumInterface = baseExceptionEnumInterface;
    }

    public int getHttpCode(){
        return httpStatus.value();
    }
    public String getErrorCode(){
        StringBuilder sb=new StringBuilder();
        sb.append(httpStatus);
        sb.append(projectId);
        sb.append(baseExceptionEnumInterface.getErrorCode());
        return sb.toString();
    }
    public String getErrorMassage(){
        return baseExceptionEnumInterface.getErrorMassage();
    }
}
