package org.springframework.context.test;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	private Student student;

	public Service() {
		System.out.println("开始创建Service");
	}
}
