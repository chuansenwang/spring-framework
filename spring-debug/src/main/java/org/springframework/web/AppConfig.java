package org.springframework.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * SpringMVC只扫描Controller，子容器
 * useDefaultFilters = false 禁用默认的过滤规则
 * <a href="RootConfig.java"><i>View Source</i></a>
 *
 * @author Chuansen.wang
 * Date: 2023/10/7 10:19
 */

@ComponentScan(value = {"com.wcs."}, includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
}, useDefaultFilters = false)
public class AppConfig {
}
