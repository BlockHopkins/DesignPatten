package com.qc.proxypattern.proxy.cglib.aop.aop.nonstaticfactory.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qc.proxypattern.proxy.cglib.aop.basic.IUser;

/**
 * IOC通过配置文件加载AOP代理 
 * 工厂非静态方法
 */
public class Main {
	static final String contextPath = "com/qc/proxypattern/proxy/cglib/aop/aop/nonstaticfactory/ioc/applicationContext.xml"; 
	public static void main(String[] args) {
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext(contextPath);
		
		IUser iUser = (IUser) ac.getBean("IUser");
		
		System.out.println(iUser.getClass());
		
		iUser.save();
		
	}
}