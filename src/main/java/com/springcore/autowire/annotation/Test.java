package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autoconfig.xml");
			
			/* here Typecasting is required
			 * Emp emp1 = (Emp)context.getBean("emp1");
			 */
			
			//to avoid typecasting, this will return Emp object so typecasting not required
			Emp emp1 = context.getBean("emp1",Emp.class);
			
			System.out.println(emp1); 
	}

}
