package com.qc.proxypattern.proxy.staticProxy;

import com.qc.proxypattern.basic.IProgrammer;
import com.qc.proxypattern.basic.ProgrammerOne;

/**
 * 静态代理
 * 程序员大V 帮程序员One代理，先发文章，然后点赞
 */
public class ProgrammerBigV implements IProgrammer {
	
	//指定程序员大V要让谁发文章（先发文章，后点赞）
	private ProgrammerOne pgOne;
	
	public ProgrammerBigV(ProgrammerOne pgOne) {
		this.pgOne = pgOne;
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
