package com.example.demo.Controller;

import com.example.demo.Vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Liu-Zihao
 * on 2019/4/7
 */
@RestController
@RequestMapping(value = "/test")
@Api("swagger的备注controller展示")
public class TestController {

    @ApiOperation(value = "测试controller method", notes = "测试controller method")
    @RequestMapping(value = "/zero", method = RequestMethod.GET)
    public Result test() {

        Result result = new Result();
        try {
            int a = 1;
            a = a / 0;
        } catch (Exception e) {

            throw new RuntimeException("math Exception" + e.getMessage());
        }

        return result;
    }
}
