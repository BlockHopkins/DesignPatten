package com.qc.strategypattern.normal.basic;

/**
 * 定义抽象策略角色 
 */
public interface IStrategy {
	
	/**
	 * 定义了一个方法，实现两个数之间的计算 
	 */
	public int calc(int num1, int num2);
}
