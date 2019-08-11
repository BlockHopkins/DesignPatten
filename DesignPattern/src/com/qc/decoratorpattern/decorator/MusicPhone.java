package com.qc.decoratorpattern.decorator;

import com.qc.decoratorpattern.basic.IPhone;
import com.qc.utils.IOUtils;

/**
 * 装饰器模式，增强功能的类继承装饰器
 */
public class MusicPhone extends PhoneDecorator {

	public MusicPhone(IPhone phone) {
		super(phone);
	}

	/**
	 * 增强功能，打电话前先听彩铃
	 */
	@Override
	public void call(){
		listenMusic();
		super.call();
	}
	
	/**
	 * 听音乐
	 */
	private void listenMusic(){
		IOUtils.println("music ...  ....");
	}
	
}
