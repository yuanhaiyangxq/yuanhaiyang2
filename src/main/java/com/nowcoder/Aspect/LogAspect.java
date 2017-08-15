package com.nowcoder.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Created by 元海洋、 on 2017/8/1.
 */
@Aspect
@Component
public class LogAspect {

    public static final Logger logger= LoggerFactory.getLogger(LogAspect.class);

    //定义切点，减少重复语句。
    @Pointcut(value ="execution(* com.nowcoder.controller.*Controller.*(..))")
    public void log(){}

    @Before("log()")
    public void beforeMethod(){
        logger.info("beforeMethod");
    }

    @After("log()")
    public void afterMethod(JoinPoint joinPoint){
        System.out.println(joinPoint);
        logger.info("afterMethod");
    }

    @AfterReturning(value = "log()",returning = "s")
    public void afterReturnning(JoinPoint joinPoint,String s){
        System.out.println(joinPoint);
        System.out.println(s);
    }

}
