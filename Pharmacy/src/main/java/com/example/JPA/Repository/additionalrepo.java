package com.example.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.Model.additionalmod;
@Repository
public interface additionalrepo extends JpaRepository<additionalmod, Integer> {

}
