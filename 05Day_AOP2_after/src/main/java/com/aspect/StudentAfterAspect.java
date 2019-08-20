package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentAfterAspect {
	
	//advice + pointcut을 분리
	@Pointcut("execution(* callEcho(..))")
	public void xxx() {}
	
	@After("xxx()")
	public void callEchoAfter(JoinPoint point) {
		System.out.println("point");
		System.out.println(point.getSignature().getName());
		System.out.println("callEchoAfter");
	}
	
	//advice + point cut
	@After("execution(* sayEcho(..))")
	public void sayEchoAfter() {
		System.out.println("sayEchoAfter");
		
		
	}
//* return 타입 
//.. 	
}
