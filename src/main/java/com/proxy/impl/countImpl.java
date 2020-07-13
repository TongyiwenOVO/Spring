package com.proxy.impl;


import com.proxy.Icount;

/**
 * 大量代码冗余
 */
public class countImpl implements Icount {
    @Override
    public Integer add(Integer a, Integer b) {
        System.out.println("日志:"+a+" + "+b);
        Integer result=a+b;
        System.out.println("结果+:"+result);
        return result;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        System.out.println("日志:"+a+" - "+b);
        Integer result=a-b;
        System.out.println("结果-:"+result);
        return result;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        System.out.println("日志:"+a+" / "+b);
        Integer result=a/b;
        System.out.println("结果/:"+result);
        return result;
    }

    @Override
    public Integer mul(Integer a, Integer b) {
        System.out.println("日志:"+a+" * "+b);
        Integer result=a*b;
        System.out.println("结果*:"+result);
        return result;
    }
}
