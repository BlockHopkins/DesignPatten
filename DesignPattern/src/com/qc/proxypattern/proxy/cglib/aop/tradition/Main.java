package com.qc.proxypattern.proxy.cglib.aop.tradition;

import com.qc.proxypattern.proxy.cglib.aop.basic.IUser;

public class Main {
	public static void main(String[] args) {
		IUser userDao = new UserDao();
		userDao.save();
	}
}
