package com.answer1991.rmi.rmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.answer1991.rmi.Account;

@Controller
public class RmiTestController {
	@Autowired
	private AccountRmiClient client;
	
	@RequestMapping("/testRmi")
	@ResponseBody
	public String handle() {
		Account account = client.getAccount("id===>055574", "name--->Joe");
		return account.getId() + account.getName();
	}
}
