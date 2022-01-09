package com.yyp.mapper;

import com.yyp.model.Account;

import java.util.List;

public interface AccountMapper {

    int addAccount(Account account);

    List<Account> getAccountList();
}
