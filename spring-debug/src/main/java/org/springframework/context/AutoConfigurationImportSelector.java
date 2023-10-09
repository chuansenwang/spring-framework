package org.springframework.context;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class AutoConfigurationImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {

		return new String[]{"org.springframework.context.AutoConfig"};
	}
}
