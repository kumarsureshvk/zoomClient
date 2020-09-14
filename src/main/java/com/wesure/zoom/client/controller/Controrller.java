package com.wesure.zoom.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controrller {

	@RequestMapping(value = "/")
	public ModelAndView index() {
		
		return new ModelAndView("index");
		
	}
	@RequestMapping(value = "index")
	public ModelAndView index1() {
		
		return new ModelAndView("index");
		
	}
	@RequestMapping(value = "meeting")
	public ModelAndView meeting() {
		
		return new ModelAndView("meeting");
		
	}
}
