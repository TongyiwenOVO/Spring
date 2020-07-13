package com.controller;

import com.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class accountController {
    @Autowired
    accountService accountService;
    public void select(){
        System.out.println("AccountController select()..");
        accountService.select();
    }
}
