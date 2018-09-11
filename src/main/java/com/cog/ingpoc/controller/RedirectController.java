package com.cog.ingpoc.controller;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController implements ErrorController{

	
	 private static final String PATH = "/error";

	    @RequestMapping(value = PATH)
	    public String forward() {
			return "forward:static/index.html";
		}

	    @Override
	    public String getErrorPath() {
	        return PATH;
	    }
}
