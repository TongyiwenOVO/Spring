package com.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 切面
 * 将非业务逻辑代码统一放置
 *
 *
 * 一个切面有多个通知
 *
 *
 *  通知：java方法
 *
 *  连接点JoinPoint：获得当前正在访问的方法的方法名和参数列表
 *
 *  切点：
 *  被增强的方法
 *
 *
 *
 * @Order 使用order来规定切面执行顺序  值越小 越先执行
 */
@Component
@Aspect
@Order(2)
public class LogAspect {
    @Pointcut("execution(* com.aop.Account.*(..))")
    private void pt1(){}

    @Before("pt1()")
    public void beforeMethod(JoinPoint jp){
       String medName= jp.getSignature().getName();

        List<Object> asList =Arrays.asList(jp.getArgs());
        System.out.println("前置通知----"+"Method:"+medName+"  args:"+asList);
    }

    @AfterReturning(value = "pt1()",returning = "result")
    public Integer afterreturn(JoinPoint jp,Object result){
        System.out.println("返回通知-----"+"Method:"+jp.getSignature().getName());
        return (Integer) result;
    }
    @AfterThrowing("pt1()")
    public void afterthrow(JoinPoint jp){
        System.out.println("异常通知-----"+"Method:"+jp.getSignature().getName());
    }
    @After("pt1()")
    public void after(JoinPoint jp){
        System.out.println("后置通知----"+"Method:"+jp.getSignature().getName());
    }

//    @Around("pt1()")
//    public Integer around(ProceedingJoinPoint pjp){
//        System.out.println("这是环绕通知");
//        Object value=null;
//        try{
//            Object[] args=pjp.getArgs();
//            System.out.println("前置通知");
//            value=pjp.proceed(args);
//            System.out.println("返回通知");
//        } catch (Throwable throwable) {
//            System.out.println("异常通知");
//        }
//        System.out.println("后置通知");
//        return (Integer) value;
//    }
}
