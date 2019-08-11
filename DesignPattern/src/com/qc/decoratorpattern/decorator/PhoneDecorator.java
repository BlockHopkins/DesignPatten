package com.qc.decoratorpattern.decorator;

import com.qc.decoratorpattern.basic.IPhone;

/**
 * 装饰器模式：
 * 1.继承装饰目标类IPhone；
 * 2.使用组合方式持有装饰目标类IPhone对象phone；
 * 3.构建器可接收装饰目标类IPhone对象作为参数，为持有的装饰目标对象phone赋值；
 * （以上三点保证可以多个装饰器嵌套使用）
 * 4.成员方法可在调用装饰目标类IPhone对象phone的相应方法基础上做增强功能。
 */
public class PhoneDecorator implements IPhone{

	private IPhone phone;
	
	public PhoneDecorator(IPhone phone) {
		this.phone = phone;
	}
	
	@Override
	public void call() {
		phone.call();
	}

}
