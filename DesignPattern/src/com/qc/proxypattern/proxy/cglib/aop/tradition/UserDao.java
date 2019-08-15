package com.qc.proxypattern.proxy.cglib.aop.tradition;

import com.qc.proxypattern.proxy.cglib.aop.basic.IUser;

/**
 *  
 *
 */
public class UserDao implements IUser{

	@Override
	public void save() {
		begin();
		System.out.println("DB：保存用户");
		close();
	}

	public void begin(){
		System.out.println("开启事务");
	}
	
	public void close(){
		System.out.println("关闭事务");
	}
}
