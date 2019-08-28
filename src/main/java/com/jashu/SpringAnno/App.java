package com.jashu.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
// Spring Core Annotation
public class App
{
    public static void main(String[] args)
    {

	System.out.println("Hello World!");

	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
	Samsung s7 = factory.getBean(Samsung.class);
	s7.config();
    }
}
