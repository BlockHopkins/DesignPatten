package com.qc.proxypattern.proxy.dynamicProxy.aop.aop;

import com.qc.proxypattern.proxy.dynamicProxy.aop.aop.UserDao;
import com.qc.proxypattern.proxy.dynamicProxy.aop.basic.IUser;

public class Main {
	public static void main(String[] args) {
		IUser userDao = new UserDao();
		userDao.save();
	}
}
