package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	
	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
	
	Demo demo1 = context.getBean("demo" , Demo.class);
	System.out.println(demo1);
	
	SpelExpressionParser temp = new SpelExpressionParser();
	Expression expression = (Expression) temp.parseExpression("22+5");
	try {
		System.out.println(expression.getValue());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
