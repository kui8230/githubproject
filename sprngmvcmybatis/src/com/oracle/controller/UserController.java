package com.oracle.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oracle.model.User;
import com.oracle.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getoneuser")
	public String getOneUser(@RequestParam("id") Integer id,HttpSession session){
		User user = userService.getUserById(id);
		session.setAttribute("user", user);
		return "ok";
	}

}
