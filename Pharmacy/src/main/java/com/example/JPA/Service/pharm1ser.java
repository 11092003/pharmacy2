package com.example.JPA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA.Model.pharmacy1;
import com.example.JPA.Repository.pharm1repo;





	@Service
	public class pharm1ser {

		
			@Autowired
			pharm1repo phRepo;
			
			public pharmacy1 saveph(pharmacy1 a) {
				return phRepo.save(a);
			}

			public List<pharmacy1> fetchph() {
				List<pharmacy1> pList=phRepo.findAll();
				return pList;
			}
	}


