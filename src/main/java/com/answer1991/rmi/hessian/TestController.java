package com.answer1991.rmi.hessian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.answer1991.rmi.Account;

@Controller
public class TestController {
	@Autowired
	private HessianClient hessianClient;
	
	@RequestMapping("/testHessian")
	@ResponseBody
	public String handle() {
		Account account = hessianClient.getAccount("id", "name. Joe");
		return account.getName();
	}
}
