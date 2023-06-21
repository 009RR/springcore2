package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		//ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
			Student student=context.getBean("con",Student.class);
			System.out.println(student);
			student.study();
		
	}

}
