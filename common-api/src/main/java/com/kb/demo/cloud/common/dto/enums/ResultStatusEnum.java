package com.kb.demo.cloud.common.dto.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public enum ResultStatusEnum {

    SUCCESS(200,"处理成功"),

    CLIENT_ERROR(400,"客户端错误"),

    SERVICE_ERROR(500,"服务器内部错误")
    ;



    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
