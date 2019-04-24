package com.thin.test.controller;

import com.thin.test.pojo.Test;
import com.thin.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("info")
    public Test infoTest(Test test){
        return testService.logTest(test);
    }

    @GetMapping("error")
    public Test errorTest(Test test){
        return testService.errorTest(test);
    }
}
