package com.qc.proxypattern.proxy.cglib.aop.aop.nonstaticfactory;

import com.qc.proxypattern.proxy.cglib.aop.aop.AOP;
import com.qc.proxypattern.proxy.cglib.aop.basic.IUser;

/**
 * AOP 动态代理实现 
 */
public class Main {
	public static void main(String[] args) {
		//业务代码
		IUser userDao = new UserDao();
		//切面类
		AOP aop = new AOP();
		//代理工厂对象
		ProxyFactory proxyFactory = new ProxyFactory();
		
		//获取代理
		IUser proxy = (IUser)proxyFactory.getProxyInstance(userDao, aop);
		//代理方法执行
		proxy.save();
	}
}
