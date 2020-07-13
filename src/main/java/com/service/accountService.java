package com.service;

import com.dao.Idao;
import com.dao.accountDao;
import com.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class accountService {

    @Autowired
    private Idao accountDao;

    public void select(){
        System.out.println("AccountService select()..");
        accountDao.select();
    }
    @Transactional
    public void transfer(String sourceName, String targetName, Float money) {
        Account source=accountDao.findAccountByName(sourceName);
        Account target=accountDao.findAccountByName(targetName);
        source.setMoney(source.getMoney()-money);
        target.setMoney(target.getMoney()+money);
        accountDao.updateAccount(source);
        int i=1/0;
        accountDao.updateAccount(target);
    }
}
