/* 
 * Copyright (c) 2016, Jiehun.com.cn Inc. All Rights Reserved 
 */
package com.di.dubbo.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.di.dubbo.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author di
 */
@RestController
public class DemoController {
    @Reference
    DemoService demoServiceImpl;

    @RequestMapping(path = "/hi")
    public Object hi(String name) {
        return demoServiceImpl.sayHello(name);
    }

}
