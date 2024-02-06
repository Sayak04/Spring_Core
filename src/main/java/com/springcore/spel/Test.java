package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spelconfig.xml");

        Demo dm1 = context.getBean("demo", Demo.class);

        System.out.println(dm1);

        SpelExpressionParser sparse = new SpelExpressionParser();
        Expression expression = sparse.parseExpression("2+3+4");

        System.out.println(expression.getValue());
    }
}
