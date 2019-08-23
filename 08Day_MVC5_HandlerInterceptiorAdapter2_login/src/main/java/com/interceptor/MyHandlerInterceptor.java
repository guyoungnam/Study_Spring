package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.controller.TestController;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle:"+handler);
		
		//로그인 여부 체크
		
		HttpSession session = request.getSession();
		if(session.getAttribute("login")==null) {
			//response.sendRedirect("loginForm"); //8090/app/loginForm
		}
		
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView mav) throws Exception {
		System.out.println("postHandle");
		
		
		//원하는 Controller 찾기
		
		HandlerMethod method = (HandlerMethod)handler;
		if(method.getBean() instanceof TestController) {
			//뷰 변경가능 및 모델 저장 가능
			mav.setViewName("login");
			mav.addObject("data","홍길동");

		}
		
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion");
	}
	
	

}
