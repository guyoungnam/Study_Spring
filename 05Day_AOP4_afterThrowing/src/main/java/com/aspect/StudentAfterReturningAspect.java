package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentAfterReturningAspect {
	


	@AfterThrowing(pointcut="execution(* sayEcho(..))",throwing="ex")
	public void sayEchoAfterReturning(JoinPoint point, Exception ex) {
		System.out.println(point.getSignature());
		System.out.println("sayEchoAfterReturning>>"+ex);
		
		
	}
//* return 타입 
//.. 	
}
