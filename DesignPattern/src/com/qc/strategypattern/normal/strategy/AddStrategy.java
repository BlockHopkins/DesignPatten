package com.qc.strategypattern.normal.strategy;

import com.qc.strategypattern.normal.basic.IStrategy;

/**
 * 具体策略角色1：加法策略
 */
public class AddStrategy implements IStrategy {

	/**
	 *  实现 calc 方法，完成两个数的和
	 */
	@Override
	public int calc(int num1, int num2) {
		return num1 + num2;
	}
}
