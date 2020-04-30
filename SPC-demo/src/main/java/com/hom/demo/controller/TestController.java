package com.hom.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hom_Wang on 2020-04-30.
 */
@Api("测试")
@RestController
public class TestController {

    @ApiOperation("测试")
    @GetMapping("/test")
    public String test() {
        return "demo|test!!!";
    }
}
