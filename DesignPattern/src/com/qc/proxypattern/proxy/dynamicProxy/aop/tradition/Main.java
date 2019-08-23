package com.qc.proxypattern.proxy.dynamicProxy.aop.tradition;

import com.qc.proxypattern.proxy.dynamicProxy.aop.basic.IUser;

public class Main {
	public static void main(String[] args) {
		IUser userDao = new UserDao();
		userDao.save();
	}
}
