package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentAfterReturningAspect {
	


	@AfterReturning(pointcut="execution(* sayEcho(..))",returning="retVal")
	public void sayEchoAfterReturning(JoinPoint point, Object retVal) {
		System.out.println(point.getSignature());
		System.out.println("sayEchoAfterReturning>>"+retVal);
		
		
	}
//* return 타입 
//.. 	
}
