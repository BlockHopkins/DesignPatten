package com.qc.proxypattern.proxy.staticProxy;

import com.qc.proxypattern.basic.IProgrammer;
import com.qc.proxypattern.basic.ProgrammerOne;

/**
 * 静态代理:
 * 程序员大V 代理 程序员One 发文章并点赞
 */
public class Main {
	public static void main(String[] args) {
		//被代理的程序员One对象
		ProgrammerOne pgOne = new ProgrammerOne();
		//受委托程序员大V对象
		IProgrammer pgProxy = new ProgrammerBigV(pgOne);
		//受委托程序员大V让程序员One发文章，大V（自己）来点赞
		pgProxy.coding();
	}
}
