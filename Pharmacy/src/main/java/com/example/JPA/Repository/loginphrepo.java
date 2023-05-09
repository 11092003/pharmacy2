package com.example.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.Model.loginphmod;

@Repository
public interface loginphrepo extends JpaRepository<loginphmod, Integer> {
	loginphmod findByUsername(String username);

}
