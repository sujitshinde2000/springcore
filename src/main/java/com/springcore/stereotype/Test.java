package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		Student student1 = context.getBean("student", Student.class);
		System.out.println(student1);
		System.out.println(student1.hashCode());
		
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student2.hashCode());
		
		
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		System.out.println(teacher1.hashCode());
		
		Teacher teacher2 = context.getBean("teacher", Teacher.class);
		System.out.println(teacher2.hashCode());
		
	}

}
