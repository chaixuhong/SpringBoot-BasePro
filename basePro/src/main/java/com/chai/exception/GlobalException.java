package com.chai.exception;

import com.chai.enums.ResultEnum;
import lombok.Getter;

@Getter
public class GlobalException extends RuntimeException {
    private int code;

    public GlobalException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
