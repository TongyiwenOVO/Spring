package com.aop;

import org.springframework.stereotype.Component;

@Component
public class Account {

    public Integer add(Integer a, Integer b) {
        System.out.println("日志:"+a+" + "+b);
        Integer result=a+b;
//        System.out.println("结果+:"+result);
        return result;
    }


    public Integer sub(Integer a, Integer b) {
        System.out.println("日志:"+a+" - "+b);
        Integer result=a-b;
        System.out.println("结果-:"+result);
        return result;
    }


    public Integer div(Integer a, Integer b) {
        System.out.println("日志:"+a+" / "+b);
        Integer result=a/b;
        System.out.println("结果/:"+result);
        return result;
    }

    public Integer mul(Integer a, Integer b) {
        System.out.println("日志:"+a+" * "+b);
        Integer result=a*b;
        System.out.println("结果*:"+result);
        return result;
    }
}
