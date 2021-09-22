package com.springcore.spei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spei/speiconfig.xml");
		Demo demo = context.getBean("demo", Demo.class);
		System.out.println(demo);

//		spring expression language

		SpelExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("22+33");
		System.out.println(expression.getValue());

	}

}
