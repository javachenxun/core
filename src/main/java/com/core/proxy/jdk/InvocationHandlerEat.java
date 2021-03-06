package com.core.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.core.proxy.IEat;

/** 
 * @author：chenxun
 * 创建时间：2016年9月11日 下午5:52:21 
 * 参考：
 * 说明：
 */
public class InvocationHandlerEat implements InvocationHandler {
	
	private IEat eat;

	public InvocationHandlerEat(IEat eat) {
		this.eat = eat;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("来点水果");
		method.invoke(eat, args);
		System.out.println("漱口");
		return null;
	}
}