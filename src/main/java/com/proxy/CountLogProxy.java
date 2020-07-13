package com.proxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 动态代理
 *       对非业务逻辑提炼出来
 *      通过动态代理类进行操作目标对象方法逻辑
 *      代理对象来控制何时何地操作
 */
public class CountLogProxy {
    private Icount icount;
    public CountLogProxy(Icount icount){
        this.icount=icount;
    }

    public Icount getProxy(){
        Icount proxy=null;
        /**
         * 1.类加载器
         * 2.类类型
         * 3.执行器
         */
        proxy= (Icount) Proxy.newProxyInstance(icount.getClass().getClassLoader(), icount.getClass().getInterfaces(), new InvocationHandler() {
            /**
             * 执行方法，公共的非业务逻辑的方法
             * @param o 返回的代理对象
             * @param method 正在调用的方法
             * @param objects 执行方法时的参数
             * @return 返回方法执行结果
             * @throws Throwable
             */
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println(method.getName()+": "+ Arrays.asList(objects));
                Object result=method.invoke(icount,objects);
                System.out.println(result);
                return  result;
            }
        });
        return proxy;
    }
}
