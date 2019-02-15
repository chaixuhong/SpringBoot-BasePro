package com.chai.enums;

import lombok.Getter;


@Getter
public enum ResultEnum {

    SUCCESS(1, "SUCCESS"),

    SERVER_ERROR(500, "服务器异常");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
