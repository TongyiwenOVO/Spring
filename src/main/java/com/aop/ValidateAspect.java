package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ValidateAspect {
    @Pointcut("execution(* com.aop.Account.*(..))")
    private void pt1(){}

    @Around("pt1()")
    public Integer advice(ProceedingJoinPoint pjp) throws Throwable {
        //获得方法名
        String methodName=pjp.getSignature().getName();
        //获得参数列表
        for (Object o:pjp.getArgs()) {
            Integer value = (Integer) o;
            if (value <= 0) {
                System.out.println("the method:" + methodName + "校验发现非正数");
                return 0;
            }
        }
        System.out.println("the method:" + methodName + "验证通过");
        Object result = pjp.proceed();
        return (Integer) result;
        }
}
