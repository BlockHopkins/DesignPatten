package com.qc.proxypattern.proxy.dynamicProxy.aop.aop.staticfactory;

import org.springframework.stereotype.Component;

import com.qc.proxypattern.proxy.dynamicProxy.aop.basic.IUser;

/**
 * AOP代理：工厂静态方法
 * 
 * 解耦，UserDao不直接调用AOP，只实现基本业务功能
 * @author Qc
 */
@Component
public class UserDao implements IUser {

	@Override
	public void save() {
		System.out.println("DB：保存用户");
	}

}
