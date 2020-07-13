package com.dao;

import com.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements Idao {
    @Override
    public void select() {
        System.out.println("Userdao Select()");
    }

    @Override
    public Account findAccountByName(String name) {
        return null;
    }

    @Override
    public void updateAccount(Account account) {

    }
}
