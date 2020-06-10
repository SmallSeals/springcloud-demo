package com.kb.demo.cloud.common.dto;

import com.kb.demo.cloud.common.dto.enums.ResultStatusEnum;

public  class ResponseResult {

    public static Result  success(Object object){
        Result result = new Result(ResultStatusEnum.SUCCESS.getCode(),ResultStatusEnum.SUCCESS.getMessage());
        result.setData(object);
        return result;
    }


    public static Result  serviceError(){
        Result result = new Result(ResultStatusEnum.SERVICE_ERROR.getCode(),ResultStatusEnum.SERVICE_ERROR.getMessage());
        return result;
    }

    public static Result  customError(Integer code,String message){
        Result result = new Result(code,message);
        return result;
    }


    public static Result  customError(String message){
        Result result = new Result(ResultStatusEnum.SERVICE_ERROR.getCode(),message);
        return result;
    }

}
