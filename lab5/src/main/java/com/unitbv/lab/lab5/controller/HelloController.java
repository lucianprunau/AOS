package com.unitbv.lab.lab5.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController
{
        
    @RequestMapping(value = "/{name}",
			method = RequestMethod.GET)
	public String sayHello(@PathVariable(value="name") String name) {
		return "Hello, " + name;
	}
}
