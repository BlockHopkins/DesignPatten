package com.qc.proxypattern.proxy.cglib.aop.aop;

import com.qc.proxypattern.proxy.cglib.aop.basic.IUser;

/**
 * 将其他Dao也要用到的开启事务、关闭事务方法（关注点）提取到 切面类AOP中，
 * 但是现在还是需要在userDao中手动调用
 */
public class UserDao implements IUser {

	//维护切面类变量
	AOP aop = new AOP();
	
	@Override
	public void save() {
		aop.begin();
		System.out.println("DB：保存用户");
		aop.close();
	}

}
