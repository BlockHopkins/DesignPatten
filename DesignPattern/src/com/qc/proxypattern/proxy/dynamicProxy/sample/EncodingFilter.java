package com.qc.proxypattern.proxy.dynamicProxy.sample;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 动态代理--样例：中文过滤器
 * 动态代理：直接拦截访问对象，给对象进行增强
 * @author Qc
 */
public class EncodingFilter {
	public void doFilter(final ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException{
		final HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		//放出去的是代理对象
		chain.doFilter((ServletRequest)Proxy.newProxyInstance(CharacterEncodingFilter.class.getClassLoader(), request.getClass().getInterfaces(), new InvocationHandler(){
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//判断是不是getParameter方法
				if(!method.getName().equals("getParameter")){
					//不是就使用request调用
					return method.invoke(request, args);
				}
				//判断是否是get类型的
				if(!request.getMethod().equalsIgnoreCase("get")){
					return method.invoke(request, args);
				}
				//执行到这里，只能是get类型的getParameter方法了。
				String value = (String)method.invoke(request, args);
				if(value == null){
					return null;
				}
				return new String(value.getBytes("ISO8859-1"),"UTF-8");
			}
		}), response);
		
	}
}
