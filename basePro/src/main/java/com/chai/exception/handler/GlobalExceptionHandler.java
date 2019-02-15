package com.chai.exception.handler;


import com.chai.enums.ResultEnum;
import com.chai.exception.AuthException;
import com.chai.exception.GlobalException;
import com.chai.utils.ResponseUtils;
import com.chai.utils.UrlUtil;
import com.chai.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResultVO handler(HttpServletRequest request, Exception e) {
        if (e instanceof AuthException) {
            AuthException authException = (AuthException) e;
            log.error("【认证异常】: err = {} url = {}", e.getMessage(), UrlUtil.getRequestUrl(request));
            return ResponseUtils.error(authException.getCode(), e.getMessage());
        } else if (e instanceof GlobalException) {
            GlobalException globalException = (GlobalException) e;
            log.error("【全局自定义异常】: err = {} url = {}", e.getMessage(), UrlUtil.getRequestUrl(request));
            return ResponseUtils.error(globalException.getCode(), e.getMessage());
        } else {
            e.printStackTrace();
            log.error("【未捕获异常】: err = {} url = {}", e.getMessage(), UrlUtil.getRequestUrl(request));
            return ResponseUtils.error(ResultEnum.SERVER_ERROR);
        }
    }
}
