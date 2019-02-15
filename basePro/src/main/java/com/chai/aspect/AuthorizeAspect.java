package com.chai.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 【拦截器】验证登陆信息
 * 【AOP】接口请求url、参数、请求时间记录日志
 */
@Component
@Aspect
@Slf4j
public class AuthorizeAspect {

    @Value("${spring.profiles.active}")
    private String environment;

    @Pointcut("execution(public * com.chai.controller.*.*(..))")
    public void verify() {
    }

    /**
     * 【切点】请求前拦截与记录
     */
    @Before("verify()")
    public void doVerify() {
        System.out.println("方法执行前"+environment);
    }

    /**
     * 【切点】请求后拦截与记录
     */
    @After("verify()")
    public void afterVerify() {
        System.out.println("方法执行后");

    }
}
