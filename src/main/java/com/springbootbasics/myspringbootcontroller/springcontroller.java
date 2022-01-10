package com.springbootbasics.myspringbootcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootbasics.myspringbootclass.UserInfo;

@RestController
public class springcontroller {
	
	@RequestMapping(method=RequestMethod.GET,path= "/")
	public String hello_handler()
	{
		return "Hello Folks! You are in the main home page from myspringbootcontroller package";
	}
	
	@GetMapping("/index")
	public String index_page_handler()
	{
		return "You're in the Index page --> home/index from myspringbootcontroller package";
	}
	
	@RequestMapping("/userinfo")
	public UserInfo getuserdetails()
	{
		System.out.println("from myspringbootcontroller package\n\n");
		return new UserInfo("Harry","Potter", 0001);
	}
	

}
