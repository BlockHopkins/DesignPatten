package com.qc.proxypattern.proxy.cglib.cglibtest;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * cglib代理：（子类代理，从内存中构建出一个子类来扩展目标对象的功能）
 * 弥补动态代理的不足【动态代理的目标对象一定要实现接口】
 * 
 * 1.需要引入cglib – jar文件， 但是spring的核心包中已经包括了cglib功能，所以直接引入spring-core-3.2.5.jar即可。
 * 2.引入功能包后，就可以在内存中动态构建子类
 * 3.代理的类不能为final，否则报错【在内存中构建子类来做扩展，当然不能为final，有final就不能继承了】
 * 4.目标对象的方法如果为final/static, 那么就不会被拦截，即不会执行目标对象额外的业务方法。
 * 
 * 
 * CGLIB是一个强大的高性能的代码生成包，它可以在运行期扩展Java类与实现Java接口。它广泛的被许多AOP的框架使用，例如Spring AOP和dynaop，为他们提供方法的interception（拦截）。
 * @author Qc
 */
public class ProxyFactory implements MethodInterceptor{
	
	//维护目标对象
	private Object target;
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	//给目标对象创建代理对象
	public Object getProxyInstance(){
		//1.工具类
		Enhancer en = new Enhancer();
		//2.设置父类
		en.setSuperclass(target.getClass());
		//3.设置回调函数
		en.setCallback(this);
		//4.创建子类（代理对象）
		return en.create();
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("开始事务......");
		//执行目标对象的方法
		Object returnValue = method.invoke(target, args);
		System.out.println("提交事务......");
		return returnValue;
	}

}
