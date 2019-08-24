package com.qc.strategypattern.strategyenum;

/**
 * 策略枚举测试 
 */
public class MainEnum {
	public static void main(String[] args) {
		//直接使用策略枚举调用具体策略
		int result = StrategyEnum.ADD.calc(5, 2);
		System.out.println(result);

		result = StrategyEnum.SUB.calc(5, 2);
		System.out.println(result);
	}
}
