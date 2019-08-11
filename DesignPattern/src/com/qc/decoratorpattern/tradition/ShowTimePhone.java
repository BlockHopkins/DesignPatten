package com.qc.decoratorpattern.tradition;

import com.qc.utils.IOUtils;

public class ShowTimePhone extends MusicPhone{

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
