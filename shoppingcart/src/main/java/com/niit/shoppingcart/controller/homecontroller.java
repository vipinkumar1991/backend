package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller {

	@RequestMapping("/")
	public ModelAndView showhomepage() 
	{
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("msg","welcome to shoppingcart");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView showloginpage() 
	{
		System.out.println("clicked on login page");
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("isuserclickedlogin","true");
		return mv;
	}
	@RequestMapping("/registration")
	public ModelAndView showregistrationpage() 
	{
		System.out.println("clicked on registration page");
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("isuserclickedregistration","true");
		return mv;
	}
	@RequestMapping("/categorymenu")
	public ModelAndView showcategorymenupage() 
	{
		System.out.println("clicked on categorymenu page");
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("isuserclickedcategorymenu","true");
		return mv;
	}
}
