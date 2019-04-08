package com.example.demo.Vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

/**
 * Create by Liu-Zihao
 * on 2019/4/7
 */
@ApiModel(value = "返回实体类", description = "返回实体类父类")
public class Result {

    @ApiParam(value = "返回实体状态码", defaultValue = "返回实体状态码")
    private String code;

    @ApiParam(value = "返回实体信息", defaultValue = "返回实体信息")
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
