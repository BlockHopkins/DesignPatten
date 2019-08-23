package com.qc.proxypattern.proxy.dynamicProxy.aop.aop.nonstaticfactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.qc.proxypattern.proxy.dynamicProxy.aop.aop.AOP;

/**
 * AOP代理：工厂非静态方法
 * 
 * 代理工厂，非静态方法，使用时需要创建代理工厂对象。
 * @author Qc
 */
public class ProxyFactory {
	public Object getProxyInstance(final Object target_, final AOP aop_){
		//目标独享和关注点代码的类都是通过外界传递进来
		
		return Proxy.newProxyInstance(
				target_.getClass().getClassLoader(),
				target_.getClass().getInterfaces(),
				new InvocationHandler(){
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						aop_.begin();
						Object returnValue = method.invoke(target_, args);
						aop_.close();
						
						return returnValue;
					}
				});
	}
}
