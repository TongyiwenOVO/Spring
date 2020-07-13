package com.dao;

import com.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class accountDao implements Idao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void select(){
        System.out.println("AccountDao select()..");
    }

    @Override
    public Account findAccountByName(String name) {
        List<Account> accounts=jdbcTemplate.query("select * from account where name=?",new BeanPropertyRowMapper<Account>(Account.class),name);
        if (accounts.isEmpty()){
            return null;
        }
        if (accounts.size()>1){
            throw new RuntimeException("结果不唯一。。");
        }
        return accounts.get(0);
    }

    @Override
    public void updateAccount(Account account) {

        jdbcTemplate.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
    }
}
