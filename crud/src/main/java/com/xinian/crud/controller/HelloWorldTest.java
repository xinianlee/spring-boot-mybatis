package com.xinian.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xinian
 * @date 2018/12/9 22:31
 */
@Controller
public class HelloWorldTest {

	@RequestMapping(value = "/hello")
	@ResponseBody
	public String helloTest(){
		return "hello";
	}
}
