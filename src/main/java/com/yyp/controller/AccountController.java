package com.yyp.controller;

import com.yyp.model.Account;
import com.yyp.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;


    @RequestMapping("/add")
    public String addAccount(Account account){
        accountService.addAccount(account);
        return  "forward:list";
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<Account> accountList = accountService.getAccountList();
        model.addAttribute("accountList",accountList);
        return "list";
    }
}
