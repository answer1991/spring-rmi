package com.answer1991.rmi;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "AccountService", targetNamespace = "http://ws.answer1991.com", portName = "AccountServiceEndPort")
public interface AccountService {
	@WebMethod
	public abstract Account getByIdAndName(String id, String name);
}
