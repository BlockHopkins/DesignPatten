package com.qc.proxypattern.proxy.staticProxy.invisibleProxy;

import com.qc.proxypattern.basic.IProgrammer;
import com.qc.proxypattern.basic.ProgrammerOne;

/**
 * 静态代理->透明代理
 * 程序员大V只做程序员One的代理，程序员One对象对外界来说是透明的，不可见的。
 */
public class ProgrammerBigV implements IProgrammer {

	//指定程序员大V要给程序员One点赞
	private ProgrammerOne pgOne;
	
	//只做pgOne的代理，pgOne不从外界接受参数来初始化，直接自己初始化
	public ProgrammerBigV() {
		this.pgOne = new ProgrammerOne();
	}
	
	/**
	 * 程序员大V点赞评论收藏转发
	 */
	public void upvote(){
		System.out.println("程序员大V点赞评论收藏转发！");
	}
	
	/**
	 * 代理程序员One发文章
	 */
	@Override
	public void coding() {
		//让程序员One发文章
		pgOne.coding();
		//程序员大V点赞评论收藏转发
		upvote();
	}
}
