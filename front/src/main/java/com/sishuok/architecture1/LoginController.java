package com.sishuok.architecture1;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.sjzmlb.customermgr.service.ICustomerService;
import com.sjzmlb.customermgr.vo.CustomerModel;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	private ICustomerService ics = null;
	
	@RequestMapping(value="/toLogin",method=RequestMethod.GET)
	public String toLogin(){
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("customerId")String customerId
			,@RequestParam("pwd")String pwd,HttpServletResponse response){
		
		if(customerId==null || customerId.trim().length()==0){
			return "login";
		}
		ics.getByUuid(1);
		CustomerModel cm = ics.getByCustomerId(customerId);
		
		if(cm==null || cm.getUuid()<=0){
			return "login";
		}
		
		Cookie c = new Cookie("MyLogin",cm.getUuid()+","+System.currentTimeMillis());
		response.addCookie(c);
		
		return "redirect:/toIndex";
	}
}
