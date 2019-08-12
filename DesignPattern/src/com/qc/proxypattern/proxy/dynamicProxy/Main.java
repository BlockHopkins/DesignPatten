package com.qc.proxypattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.qc.proxypattern.basic.IProgrammer;
import com.qc.proxypattern.basic.ProgrammerOne;

/**
 * 动态代理：
 * 程序员One请水军点赞
 * 
 * 关键方法：
 * java.lang.reflect.Proxy.newProxyInstance(ClassLoader, Class<?>[], InvocationHandler)
 * 参数一：生成代理对象使用哪个类装载器【一般我们使用的是被代理类的装载器】
 * 参数二：生成哪个对象的代理对象，通过接口指定【指定要被代理类的接口】
 * 参数三：生成的代理对象的方法里干什么事【实现handler接口，我们想怎么实现就怎么实现】
 * 
 * 在编写动态代理之前，要明确几个概念：
 * 代理对象拥有目标对象相同的方法【因为参数二指定了对象的接口，代理对象会实现接口的所有方法】
 * 用户调用代理对象的什么方法，都是在调用处理器的invoke方法。【被拦截】
 * 使用JDK动态代理必须要有接口【参数二需要接口】
 * 
 * 动态代理具体调用过程：
 * [Client] --doSth()--> [DynamicProxy] --invoke()--> [MyInvocationHandler] --"invoke()"--> [Subject对象]
 */
public class Main {
	public static void main(String[] args) {
		
		//受代理对象程序员One
		ProgrammerOne pgOne = new ProgrammerOne();
		//动态代理水军对象，不需要预先定义对象，代理方法由 InvocationHandler 实现
		IProgrammer pgWaterArmy = (IProgrammer)Proxy.newProxyInstance(pgOne.getClass().getClassLoader(), pgOne.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//如果调用的是 coding 方法，那么水军就要点赞了
				if(method.getName().equals("coding")){
					method.invoke(pgOne, args);
					System.out.println("我是水军，我来点赞了！！！");
				}else{
					//如果调用的不是coding方法，就还是调用原对象的方法
					return method.invoke(pgOne, args);
				}
				return null;
			}
		});
		//每当受代理对象程序员One写完文章，水军都会点赞
		pgWaterArmy.coding();
	}
}
