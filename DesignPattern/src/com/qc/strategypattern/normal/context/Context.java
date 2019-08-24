package com.qc.strategypattern.normal.context;

import com.qc.strategypattern.normal.basic.IStrategy;

/**
 * 上下文环境，应用策略
 *
 */
public class Context {
	//持有抽象策略角色，从外界接收具体策略角色
	private IStrategy strategy;
	
	public Context(IStrategy strategy){
		this.strategy = strategy;
	}
	
	public int calculate(int num1, int num2){
		return this.strategy.calc(num1, num2);
	}
}
