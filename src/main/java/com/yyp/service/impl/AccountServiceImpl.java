package com.yyp.service.impl;

import com.yyp.mapper.AccountMapper;
import com.yyp.model.Account;
import com.yyp.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountDao;

    @Override
    public int addAccount(Account account) {

            int row = accountDao.addAccount(account);
            return row;
    }

    @Override
    public List<Account> getAccountList() {
            List<Account> accountList = accountDao.getAccountList();
            return accountList;
    }
}
