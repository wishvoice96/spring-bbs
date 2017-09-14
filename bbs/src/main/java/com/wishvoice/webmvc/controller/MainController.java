package com.wishvoice.webmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

	private   Logger logger =LoggerFactory.getLogger(MainController.class);
	
		@RequestMapping("/")
		public String main() {
			logger.debug("spring logback main");
			return "main";
		}
}
