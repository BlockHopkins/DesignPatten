package com.qc.decoratorpattern.tradition;

import com.qc.decoratorpattern.basic.PhoneX;
import com.qc.utils.IOUtils;

public class MusicPhone extends PhoneX{
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
