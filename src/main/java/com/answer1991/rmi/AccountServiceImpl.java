package com.answer1991.rmi;

public class AccountServiceImpl implements AccountService {

	@Override
	public Account getByIdAndName(String id, String name) {
		Account account = new Account();
		account.setId(id);
		account.setName(name);
		return account;
	}
	
}
