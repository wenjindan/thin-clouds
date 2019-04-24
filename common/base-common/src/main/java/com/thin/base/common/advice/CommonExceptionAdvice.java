package com.thin.base.common.advice;

import com.thin.base.common.exception.BaseHttpException;
import com.thin.base.common.vo.BaseResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionAdvice {
    @ExceptionHandler
    public ResponseEntity handlerBaseHttpException(BaseHttpException e){
        if(e instanceof BaseHttpException){
            BaseResult baseResult = new BaseResult(e.getErrorCode(),e.getErrorMassage());
            return ResponseEntity.status(e.getHttpCode()).body(baseResult);
        }
        BaseResult baseResult = new BaseResult(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()),HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(baseResult);
    }
}
