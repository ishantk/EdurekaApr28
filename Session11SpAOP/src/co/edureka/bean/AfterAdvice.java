package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object obj1, Method method, Object[] objArr, Object obj2) throws Throwable {
		
		System.out.println("==after execution started==");
		
		System.out.println("Method: "+method.getName());
		System.out.println("*************************");
		for(Object o : objArr){
			System.out.println(o);
		}
		System.out.println("*************************");
		System.out.println("obj is: "+obj1);
		System.out.println("obj is: "+obj2);
		System.out.println("==after execution finished==");
		
	}

}
