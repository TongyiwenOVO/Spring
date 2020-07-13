package com.proxy;

import com.proxy.impl.countImpl;

public class Maintest {
    public static void main(String[] args) {
        Icount icount=new countImpl();
        Icount proxy=new CountLogProxy(icount).getProxy();
        Integer result=proxy.add(1,2);
    }
}
