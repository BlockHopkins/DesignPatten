package com.qc.decoratorpattern.decorator;

import com.qc.decoratorpattern.basic.IPhone;
import com.qc.utils.IOUtils;

/**
 * 装饰器模式，增强功能的类继承装饰器
 */
public class ShowTimePhone extends PhoneDecorator {

	public ShowTimePhone(IPhone phone) {
		super(phone);
	}

	/**
	 * 在MusicPhone增强功能，打电话前先听彩铃，打电话后展示时间
	 */
	@Override
	public void call() {
		super.call();
		showTime();
	}
	
	/**
	 * 展示时间
	 */
	private void showTime(){
		IOUtils.println("currentTime... "+ System.currentTimeMillis());
	}
}
