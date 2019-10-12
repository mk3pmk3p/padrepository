package com.padrank.link.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.padrank.link.paramform.ParamForm;

@Controller
public class PadController {

	@RequestMapping("/index")
	public String main(ModelMap map) {
		map.put("cityname", "Tokyo");
		return "index";
	}
	@RequestMapping("/getData")
	public ResponseEntity<?> main(ParamForm form) {
		
		List<String> list = new ArrayList<String>();
		list.add(form.getName());
		list.add(form.getNumber());
		return ResponseEntity.ok(list);
	}
	
}
