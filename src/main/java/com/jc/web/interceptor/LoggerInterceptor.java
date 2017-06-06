package com.jc.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 对控制器进行日志的功能扩展。
 */
public class LoggerInterceptor extends HandlerInterceptorAdapter {

	//表示所有的请求完成之后要执行的代码（jsp执行之后）
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws Exception {
		System.out.println(this.getClass().getName()+" - afterCompletion()执行了。");
	}

	//表示请求执行后要执行的代码(控制器执行后)
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println(this.getClass().getName()+" - postHandle()执行了。");
	}

	//表示请求执行前要执行的代码(控制器执行前)
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println(this.getClass().getName()+" - preHandle()执行了。");
		return true; //true表示通过拦截器，可以执行后续流程；false表示不能通过拦截器，不能执行后续流程。
	}
	
}
