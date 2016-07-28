package com.indify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class indifyHelloWorld {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		String message="<br><div style='text-align:center;'>"+
			"<h3> ***** Hello World, Spirng MVC Tutorial</h3> This message comes from Indika";
		return new ModelAndView("welcome","message",message);
				
	}
}
