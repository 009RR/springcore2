package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("firststudent")
public class Student {
	
	private Samosa samosa;
	
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa=samosa;
	}



	public void study() {
		
		this.samosa.display();
		System.out.println("studnet is studing");
	}

}
