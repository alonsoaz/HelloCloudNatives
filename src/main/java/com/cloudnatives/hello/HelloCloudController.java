package com.cloudnatives.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloCloudController {
	@RequestMapping("/")
	@ResponseBody
	public String sayHello() {
		return "Hello Cloud Natives";
	}
	
	@RequestMapping("/byenovember")
	@ResponseBody
	public String byenovember() {
		return "Bye November";
	}

}
