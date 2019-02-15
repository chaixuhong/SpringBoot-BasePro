package com.chai.exception;


import com.chai.enums.ResultEnum;
import lombok.Getter;

/**
 * 身份认证自定义异常
 */
@Getter
public class AuthException extends RuntimeException {
    private int code;

    public AuthException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
