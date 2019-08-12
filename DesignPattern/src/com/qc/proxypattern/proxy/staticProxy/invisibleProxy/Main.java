package com.qc.proxypattern.proxy.staticProxy.invisibleProxy;

/**
 * 静态代理->透明代理:
 * 程序员大V 代理 程序员One 发文章并点赞，
 * 
 * 比起静态代理，这里不需要外界创建程序员One对象，完全由pgProxy代理。
 */
public class Main {
	public static void main(String[] args) {
		//受委托程序员大V对象
		ProgrammerBigV pgProxy = new ProgrammerBigV();
		//受委托程序员大V让程序员One发文章，大V（自己）来点赞
		pgProxy.coding();
	}
}
