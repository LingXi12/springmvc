package com.yyp.service;

import com.yyp.model.Account;

import java.util.List;

public interface IAccountService {
    int addAccount(Account account);

    List<Account> getAccountList();
}
