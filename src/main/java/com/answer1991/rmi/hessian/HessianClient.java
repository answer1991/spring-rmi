package com.answer1991.rmi.hessian;

import com.answer1991.rmi.Account;
import com.answer1991.rmi.AccountService;

public class HessianClient {
	private AccountService accountService;

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	public Account getAccount(String id, String name) {
		return accountService.getByIdAndName(id, name);
	}
}
