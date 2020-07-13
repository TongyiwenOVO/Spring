package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements Idao {
    @Override
    public void select() {
        System.out.println("Userdao Select()");
    }
}
