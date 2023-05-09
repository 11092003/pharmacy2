package com.example.JPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.Model.loginphmod;
import com.example.JPA.Service.loginphser;

@RestController
public class loginphcon { 
		@Autowired
		loginphser usrService;
		@PostMapping("/checkLogin")
			public String validateUser(@RequestBody loginphmod u)
			{
			System.out.println(u.getUsername());
				return usrService.validateUser(u.getUsername(),u.getPassword());
			}
		@PostMapping("/addUser")
		public loginphmod main(@RequestBody loginphmod u)
		{
		return usrService.saveUser(u);
		}
}
