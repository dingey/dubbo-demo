/* 
 * Copyright (c) 2016, Jiehun.com.cn Inc. All Rights Reserved 
 */
package com.di.dubbo.demo.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dinglinbo
 * @date 2017/9/14
 * @since 1.0.0
 */
@RestController
public class ProviderController {
    @RequestMapping(path = "/hi")
    public String hi() {
        return "hello from provider";
    }
}
