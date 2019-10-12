package com.padrank.link.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PadController {

	@RequestMapping("/index")
	public String main() {
		return "index";
	}
}
