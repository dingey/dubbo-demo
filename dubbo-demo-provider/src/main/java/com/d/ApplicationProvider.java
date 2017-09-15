/* 
 * Copyright (c) 2016, Jiehun.com.cn Inc. All Rights Reserved 
 */
package com.d;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

@ComponentScan(excludeFilters = { @Filter(type = FilterType.REGEX, pattern = "com.d.base.*") })
@SpringBootApplication
public class ApplicationProvider {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationProvider.class, args);
	}

}