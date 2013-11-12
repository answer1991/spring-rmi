package com.answer1991.rmi.rmi;

import com.answer1991.rmi.Account;
import com.answer1991.rmi.AccountService;

public class AccountRmiClient {
	private AccountService accountService;
	
	public Account getAccount(String id, String name) {
		return accountService.getByIdAndName(id, name);
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
}
