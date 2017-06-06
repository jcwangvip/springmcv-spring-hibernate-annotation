package com.jc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class TestController {

	@RequestMapping
    public String dispatchTest()
    {
        System.out.println("Enter TestController.dispatchTest");
        return "test";
    }
	
	@RequestMapping(value="/index")
    public String dispatchLogin()
    {
        System.out.println("Enter TestController.dispatchTest");
        return "test";
    }
}
