package org.springframework.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *     Spring的容器不扫描Controller，父容器
 * <a href="RootConfig.java"><i>View Source</i></a>
 *
 * @author Chuansen.wang
 * Date: 2023/10/7 10:19
 */

@ComponentScan(value = {"com.wcs."},excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
})
public class RootConfig {
}
