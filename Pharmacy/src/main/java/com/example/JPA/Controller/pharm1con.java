package com.example.JPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.Model.pharmacy1;
import com.example.JPA.Service.pharm1ser;




	@RestController
	public class pharm1con {

		@Autowired
		pharm1ser pService;
		
		@GetMapping("/fetchph")
		public List<pharmacy1> fetchph() {
			List<pharmacy1> pList=pService.fetchph();
			return pList;
		}
		
		@PostMapping("/saveph")
		public pharmacy1 saveph(@RequestBody pharmacy1 p) {
			return pService.saveph(p);
		}
	}

