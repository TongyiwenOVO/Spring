package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class accountDao implements Idao {
    public void select(){
        System.out.println("AccountDao select()..");
    }
}
