package org.springframework.context.test;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	private String sex;

	public Student(){
		System.out.println("Student");
	}

	public Student(String name,String sex){
		System.out.println("Student");
		this.sex = sex;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
