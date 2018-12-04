package com.xinian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xinian
 * @date 2018/11/21 22:25
 */
@Controller
public class LogTest {

	@RequestMapping(value = "/hello")
	@ResponseBody
	public String hello(){
		return "HelloWorld";
	}
}
