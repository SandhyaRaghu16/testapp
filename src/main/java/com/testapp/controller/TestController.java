package com.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value="/getMsg")
	public String getMsg()
	{
		return "Hey !!! Have A Great Day :) ";
	}

}
