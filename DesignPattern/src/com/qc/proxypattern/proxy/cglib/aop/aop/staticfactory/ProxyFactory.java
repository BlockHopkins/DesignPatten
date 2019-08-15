package com.qc.proxypattern.proxy.cglib.aop.aop.staticfactory;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.qc.proxypattern.proxy.cglib.aop.aop.AOP;

/**
 * AOP代理：工厂静态方法
 * 
 * 代理工厂，使用静态方法返回代理对象，调用时不需要创建工厂对象
 * @author Qc
 */
public class ProxyFactory {
	//维护目标对象
	private static Object target;
	
	//维护关注点代码的类
	private static AOP aop;
	public static Object getProxyInstance(Object target_, AOP aop_){
		//目标对象和关注点代码的类都是外界传入
		target = target_;
		aop = aop_;
		
		//创建代理对象
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//使用动态代理完成切面方法调用
						aop.begin();
						//业务方法
						Object returnValue = method.invoke(target, args);
						//使用动态代理完成切面方法调用
						aop.close();
						
						return returnValue;
					}
				}
			);
	}
}
