package com.qc.proxypattern.proxy.cglib.aop.aop;

import org.springframework.stereotype.Component;

/**
 * 关注点形成的类，就叫切面(类)
 * 多个Dao都需要开启事务和关闭事务的功能，为了通用性，提取逻辑到切面(类)。
 */
@Component
public class AOP {
	/**
	 * 开启事务
	 */
	public void begin(){
		System.out.println("开启事务");
	}
	
	/**
	 * 关闭事务 
	 */
	public void close(){
		System.out.println("关闭事务");
	}
}
