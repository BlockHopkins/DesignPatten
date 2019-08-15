package com.qc.proxypattern.proxy.cglib.aop.aop;

import com.qc.proxypattern.proxy.cglib.aop.basic.IUser;
import com.qc.proxypattern.proxy.cglib.aop.aop.UserDao;

public class Main {
	public static void main(String[] args) {
		IUser userDao = new UserDao();
		userDao.save();
	}
}
