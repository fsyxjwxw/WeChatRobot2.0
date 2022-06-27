package com.ryan.robot.entity.vo;

import lombok.Data;

/**
 * @program: robot
 * @description: 返回结果对象
 * @author: TBKJ
 * @create: 2022-01-09
 **/
@Data
public class Result {
    private static final Integer SUCCESS_CODE = 200;
    private static final Integer ERROR_CODE = 201;

    private Object data;
    private Integer code;
    private String message;

    public Result() {
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, Object data, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public static Result success(Object data, String message){
        return new Result(SUCCESS_CODE,data,message);
    }

    public static Result err(String message){
        return new Result(ERROR_CODE,message);
    }
}
