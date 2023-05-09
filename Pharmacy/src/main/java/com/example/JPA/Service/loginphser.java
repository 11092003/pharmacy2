package com.example.JPA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA.Model.loginphmod;
import com.example.JPA.Repository.loginphrepo;

@Service
public class loginphser{
		@Autowired
		loginphrepo userRepo;
	public loginphmod saveUser(loginphmod u)
	{
	return userRepo.save(u);
	}
	public String validateUser(String username,String password)
	{
		String result="";
		loginphmod u=userRepo.findByUsername(username);
		if(u==null)
		{
			result="Invalid user";
		}
			else
			{
				if(u.getPassword().equals(password))
				{
					result="Login success";
				}
				else
				{
					result="Login failed";
				}
			}
		

		return result;
}
}