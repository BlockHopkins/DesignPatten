package com.qc.strategypattern.strategyenum;

/**
 * 策略枚举
 * 
 * 策略模式 中的上下文环境（Context），其职责本来是隔离客户端与策略类的耦合，
 * 让客户端完全与上下文环境沟通，无需关系具体策略。
 * 
 * 但是在普通策略模式中，客户端内部直接自己指定要哪种策略
 *   IStrategy strategy = new AddStrategy();
 * 客户端与具体策略类耦合了，而上下文环境在这里其的作用只是负责调度执行，获取结果，并没有完全起到隔离客户端与策略类的作用、
 * 
 * 一般可以通过“简单工厂模式”将具体策略的创建与客户端进行隔离，或者是通过“策略枚举”将上下文环境与具体策略类融合在一起，简化代码。
 * 这里使用“策略枚举”演示
 */
public enum StrategyEnum {
	ADD("+") {
		@Override
		public int calc(int a, int b) {
			return a + b;
		}
		
	},
	SUB("-"){
		@Override
		public int calc(int a, int b) {
			return a - b;
		}
		
	};
	
	private String symbol;
	
	private StrategyEnum(String symbol){
		this.symbol = symbol;
	}
	
	private String getSymbol(){
		return this.symbol;
	}
	
	public abstract int calc(int a, int b);
}
