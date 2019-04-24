package com.thin.test.service;

import com.thin.base.common.Constants;
import com.thin.base.common.exception.BaseHttpException;
import com.thin.test.enums.ExceptionStatusEnum;
import com.thin.test.pojo.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private static final Logger logger= LoggerFactory.getLogger(TestService.class);
    public Test errorTest(Test test){
        logger.info(test.toString());
        throw new BaseHttpException(HttpStatus.BAD_REQUEST, Constants.test,ExceptionStatusEnum.TEST_ENUM);
    }

    public Test logTest(Test test){
        logger.info(test.toString());
        return test;
    }
}
