package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentBeforeAspect {
	
	//advice + pointcut을 분리
	@Pointcut("execution(* callEcho(..))")
	public void xxx() {}
	
	@Before("xxx()")
	public void callEchoBefore(JoinPoint point) {
		System.out.println("point");
		System.out.println(point.getSignature().getName());
		System.out.println("callEchoBefore");
	}
	
	//advice + point cut
	@Before("execution(* sayEcho(..))")
	public void sayEchoBefore() {
		System.out.println("sayEchoBefore");
		
		
	}
//* return 타입 
//.. 	
}
