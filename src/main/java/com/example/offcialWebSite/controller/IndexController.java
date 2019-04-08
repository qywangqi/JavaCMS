package com.example.offcialWebSite.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.common.annotation.Log;

/**
 * 网站首页的controller
 * @author cooo
 */
@Controller
@RequestMapping("/")
public class IndexController {

	// 引入日志实例
	private static Logger logger = Logger.getLogger(IndexController.class);
	
	@Log("请求访问主页")
	@GetMapping({"/",""})
	String welcome(){
		return "redirect:/index.html";
	}
	
	
	
}
