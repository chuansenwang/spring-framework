package org.springframework.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AutoImportBean.class)
public class AutoConfig {

	@Bean
	public AutoBean autoBean() {
		return new AutoBean();
	}
}
