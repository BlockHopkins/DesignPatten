package com.qc.proxypattern.proxy.dynamicProxy.sample;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 动态代理--样例：中文过滤器
 * @author Qc
 */
public class EncodingFilter {
	public void doFilter(final ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException{
		
	}
}
