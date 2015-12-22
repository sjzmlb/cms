package com.sjzmlb.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping(value="/toIndex",method=RequestMethod.GET)
	public String toIndex(Model model){
		return "index";
	}
}
