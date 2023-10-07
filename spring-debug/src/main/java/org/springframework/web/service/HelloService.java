package org.springframework.web.service;

import org.springframework.stereotype.Service;

/**
 * <p>
 * <a href="HelloService.java"><i>View Source</i></a>
 *
 * @author Chuansen.wang
 * Date: 2023/10/7 10:21
 */
@Service
public class HelloService {
	public String sayHello(String name) {
		return "Hello," + name;
	}
}
