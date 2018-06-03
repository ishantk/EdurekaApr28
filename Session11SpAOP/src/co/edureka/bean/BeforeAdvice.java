package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objArr, Object obj) throws Throwable {
		System.out.println("==before execution started==");
		
		System.out.println("Method: "+method.getName());
		System.out.println("*************************");
		for(Object o : objArr){
			System.out.println(o);
		}
		System.out.println("*************************");
		System.out.println("obj is: "+obj);
		System.out.println("==before execution finished==");
	}

}
