package com.example.JPA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.JPA.Model.pharMod;
@Repository
public interface pharRepo extends JpaRepository<pharMod, Integer> {

//	//Native query
//	@Query(value="select * from pharMod s where s.id=?1",nativeQuery=true)
//	public List<pharMod> getquery(int id);
	
	@Query("select s from pharMod s where s.name=?1")
	 public List<pharMod>getpharByname(String name);
//	//named parameters
	@Query("select s from pharMod s where s.id=:id")
	public List<pharMod> getpharByid(int id);
//	//DML
	@Modifying
	@Query("delete from pharMod s where s.name=?1")
	public int deletepharByname(String name);
//	//update query
	@Modifying
	@Query("update  pharMod s set s.name=?1 where s.id=?2")
	public int updatepharByname(String name,int id);
	
}
