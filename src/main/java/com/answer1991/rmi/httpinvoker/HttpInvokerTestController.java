package com.answer1991.rmi.httpinvoker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.answer1991.rmi.Account;

@Controller
public class HttpInvokerTestController {
	@Autowired
	private AccountHttpInvokerClient client;
	
	@RequestMapping("/testHttpInvoker")
	@ResponseBody
	public String handle() {
		Account account = client.getByIdAndName("id--->055574", "name-->Joe");
		return account.getId() + account.getName();
	}
}
