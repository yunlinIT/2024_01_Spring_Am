package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrAjaxTestController {

	@RequestMapping("/usr/home/plus")
	public String showTestPage() {
		return "/usr/home/AjaxTest";
	}

	@RequestMapping("/usr/home/doPlus")
	@ResponseBody
	public int doPlus(int num1, int num2) {
		return num1 + num2;
	}

}