package com.qc.strategypattern.normal;

import com.qc.strategypattern.normal.basic.IStrategy;
import com.qc.strategypattern.normal.context.Context;
import com.qc.strategypattern.normal.strategy.AddStrategy;

/**
 * 策略模式：
 *   其思想是针对一组算法，将每一种算法都封装到具有共同接口的独立的类中，从而是它们可以相互替换。
 *   策略模式的最大特点是使得算法可以在不影响客户端的情况下发生变化，从而改变不同的功能。
 */
public class Main {
	public static void main(String[] args) {
		//选择一个具体策略角色
		IStrategy strategy = new AddStrategy();
		//构造上下文环境
		Context context = new Context(strategy);
		//客户端直接让上下文环境执行算法
		context.calculate(5, 3);
	}
}
