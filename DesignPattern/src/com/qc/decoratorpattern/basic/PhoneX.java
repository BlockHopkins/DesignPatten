package com.qc.decoratorpattern.basic;

import com.qc.utils.IOUtils;

public class PhoneX implements IPhone{

	@Override
	public void call() {
		IOUtils.println("... calling my ClapTrap...");
	}

}
