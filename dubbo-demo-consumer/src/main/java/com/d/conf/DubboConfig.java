/* 
 * Copyright (c) 2016, Jiehun.com.cn Inc. All Rights Reserved 
 */
package com.d.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dubbo/dubbo.properties")
@ImportResource({ "classpath:dubbo/*.xml" })
public class DubboConfig {

}