package org.springframework.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.HelloService;

/**
 * <p>
 * <a href="HelloController.java"><i>View Source</i></a>
 *
 * @author Chuansen.wang
 * Date: 2023/10/7 10:21
 */
@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;

	@ResponseBody
	@RequestMapping("hello")
	public String hello() {
		String hello = helloService.sayHello("tomcat");
		return hello;
	}
}
