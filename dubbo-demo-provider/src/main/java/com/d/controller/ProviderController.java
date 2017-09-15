package com.d.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author d
 */
@RestController
public class ProviderController {
    @RequestMapping(path = "/hi")
    public String hi() {
        return "hello from provider";
    }
}
