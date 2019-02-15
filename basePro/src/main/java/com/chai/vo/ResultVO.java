package com.chai.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@ApiModel(value = "返回类")
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 3068837394742385883L;

    @ApiModelProperty("错误码")
    private Integer code;
    @ApiModelProperty("提示信息")
    private String errMsg;
    @ApiModelProperty("数据")
    private T data;
}
