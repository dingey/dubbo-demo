package com.d.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.d.interceptor.PathInterceptor;

/**
 * @author d
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new PathInterceptor()).addPathPatterns("/**");
	}
}
