package com.answer1991.rmi.ws;

import com.answer1991.rmi.Account;
import com.answer1991.rmi.AccountService;

public class AccountWSClient implements AccountService {
	private AccountService accountService;
	
	@Override
	public Account getByIdAndName(String id, String name) {
		return accountService.getByIdAndName(id, name);
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
}
