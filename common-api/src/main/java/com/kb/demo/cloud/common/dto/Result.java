package com.kb.demo.cloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result <T> {
    private Integer statusCode;

    private String message;

    private T data;

    public Result(Integer statusCode,String message){
        this.statusCode = statusCode;
        this.message = message;
    }

}