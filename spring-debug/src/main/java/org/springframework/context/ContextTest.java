package org.springframework.context;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class ContextTest {
	public static void main(String[] args) {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(Config.class);
		context.refresh();

	}
}
