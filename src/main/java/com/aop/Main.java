package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean_aop.xml");
        Account account=ac.getBean(Account.class);
        Integer result=account.add(1,2);
        System.out.println(result);
        Integer result1=account.div(1,0);
    }
}
