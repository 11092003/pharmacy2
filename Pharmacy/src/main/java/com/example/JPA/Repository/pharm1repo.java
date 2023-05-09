package com.example.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.Model.pharmacy1;

@Repository
public interface pharm1repo extends JpaRepository<pharmacy1, Integer> {

}
