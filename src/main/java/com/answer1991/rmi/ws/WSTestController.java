package com.answer1991.rmi.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.answer1991.rmi.Account;

@Controller
public class WSTestController {
	@Autowired
	private AccountWSClient client;
	
	@RequestMapping("/testWS")
	@ResponseBody
	public String handle() {
		Account account = client.getByIdAndName("ws-id", "ws-name");
		return account.getId() + "," + account.getName();
	}
}
