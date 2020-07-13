package com.dao;

import com.entity.Account;

public interface Idao {
    public void select();

    Account findAccountByName(String name);

    void updateAccount(Account account);
}
