package com.service;

import com.dao.Idao;
import com.dao.accountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class accountService {

    @Autowired
    private Idao accountDao;

    public void select(){
        System.out.println("AccountService select()..");
        accountDao.select();
    }
}
