package com;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainTest {
    public static void main(String[] args) throws Exception {
//
//        HelloWord helloWord=new HelloWord();
//        helloWord.setUsername("张三");
//        helloWord.work();
//
//        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloWord hello=ac.getBean("hello",HelloWord.class);
//        hello.work();
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        ComboPooledDataSource dataSource=ac.getBean("dataSource",ComboPooledDataSource.class);
        System.out.println(dataSource);

        Connection connection=dataSource.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("select * from account");
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString(2));
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
