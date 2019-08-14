package com.qc.proxypattern.proxy.cglib.cglibtest;

/**
 * cglib代理测试 
 */
public class Main {
	public static void main(String[] args) {
		//受代理对象
		Student student = new Student();
		//创建代理
		Student proxyFactory = (Student)new ProxyFactory(student).getProxyInstance();
		proxyFactory.sayHello();
		
		System.out.println("proxy class : ");
		System.out.println(proxyFactory.getClass());
	}
}

class Student{
	final String word = "hello! I am a student";
	public String sayHello(){
		System.out.println(word);
		return word;
	}
}