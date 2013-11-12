package com.answer1991.rmi.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.answer1991.rmi.Account;
import com.answer1991.rmi.AccountService;
import com.answer1991.rmi.AccountServiceImpl;

@WebService(serviceName = "AccountService", targetNamespace = "http://ws.answer1991.com", portName = "AccountServiceEndPort")
public class AccountWebService {
	private AccountService accountService = new AccountServiceImpl();
	
	@WebMethod
	public Account getByIdAndName(String id, String name) {
		return accountService.getByIdAndName(id, name);
	}
	
}
