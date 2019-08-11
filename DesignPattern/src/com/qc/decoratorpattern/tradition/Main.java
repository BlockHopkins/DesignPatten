package com.qc.decoratorpattern.tradition;

import com.qc.decoratorpattern.basic.IPhone;

/**
 * 传统继承方式实现，
 * 先听彩铃，然后打电话，然后看时间
 */
public class Main {
	public static void main(String[] args) {
		IPhone phone = new ShowTimePhone();
		phone.call();
	}
}
