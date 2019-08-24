package com.qc.strategypattern.normal.strategy;

import com.qc.strategypattern.normal.basic.IStrategy;

/**
 * 具体策略局角色：减法策略
 */
public class SubtractStrategy implements IStrategy {

	@Override
	public int calc(int num1, int num2) {
		return num1 - num2 ;
	}

}
