package com.chai.utils;


import com.chai.enums.ResultEnum;
import com.chai.vo.ResultVO;

public class ResponseUtils {
    public static ResultVO success(){
        ResultVO result = new ResultVO();
        result.setCode(ResultEnum
                .SUCCESS.getCode());
        result.setErrMsg(ResultEnum.SUCCESS.getMessage());
        return result;
    }

    public static ResultVO success(Object object){
        ResultVO result = new ResultVO();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setErrMsg(ResultEnum.SUCCESS.getMessage());
        result.setData(object);
        return result;
    }

    public static ResultVO error(ResultEnum error){
        ResultVO result = new ResultVO();
        result.setCode(error.getCode());
        result.setErrMsg(error.getMessage());
        return result;
    }

    public static ResultVO error(Integer code, String message) {
        ResultVO result = new ResultVO();
        result.setCode(code);
        result.setErrMsg(message);
        return result;
    }

}
