package com.d.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.d.dubbo.DemoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author di
 */
@Controller
public class DemoController {
	@Reference
	DemoService demoServiceImpl;

	@ResponseBody
	@RequestMapping(path = "/hi")
	public Object hi(String name) {
		return demoServiceImpl.sayHello(name);
	}

	@RequestMapping(path = "/demo")
	public Object demo(String name, Model model) {
		model.addAttribute("name", demoServiceImpl.sayHello(name));
		return "/index";
	}
}
