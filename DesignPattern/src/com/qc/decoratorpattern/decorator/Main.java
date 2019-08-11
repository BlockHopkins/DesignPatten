package com.qc.decoratorpattern.decorator;

import com.qc.decoratorpattern.basic.IPhone;
import com.qc.decoratorpattern.basic.PhoneX;

/**
 * 装饰器模式实现，
 * 先听彩铃，然后打电话，然后看时间，
 * 
 * 如果不想听彩铃，将 phone = new MusicPhone(phone); 这一行注释掉即可；
 * 如果不想看时间，将 phone = new ShowTimePhone(phone); 这一行注释掉即可
 * 
 * 如果想先看时间，再打电话，再听彩铃，
 * 则需要改 MusicPhone 和  ShowTimePhone 中call()方法中调用super.call()和装饰方法的前后顺序。
 * 
 * 这种改变比起继承来说，由于两个装饰器类没有相互继承关系，只需要改call方法就行了，
 * 继承方式则本身从语义上就规定了先Music，然后ShowTime (因为ShowTimePhone继承自MusicPhone)。
 */
public class Main {
	public static void main(String[] args) {
		IPhone phone = new PhoneX();
		phone = new MusicPhone(phone);
		phone = new ShowTimePhone(phone);
		phone.call();
	}
}
