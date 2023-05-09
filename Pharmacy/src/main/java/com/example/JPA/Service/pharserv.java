package com.example.JPA.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.JPA.Model.pharMod;
import com.example.JPA.Repository.pharRepo;

import jakarta.transaction.Transactional;
@Service
public class pharserv {
	
	
    @Autowired
	pharRepo phre;
    public List<pharMod> main(){
    	return phre.findAll();
    }
    public pharMod sub (pharMod ph) {
    	return phre.save(ph);
    }
    public pharMod dub(pharMod ph) {
    	return phre.save(ph);
    }
    public void del(int cost)
    {
        phre.deleteById(cost);
    }
    //sorting
    
    public List<pharMod> sorting(String name)
    {
    	return phre.findAll(Sort.by(name).descending());
    }
    //pagination
   public List<pharMod> page(int pgno, int pgsize)
    {
    	Page<pharMod> p=phre.findAll(PageRequest.of(pgno, pgsize));
    	return p.getContent();
    }
   //pagination sorting
   public List<pharMod> paginationsorting(int pnum,int psize,String name){
  Page<pharMod> p=phre.findAll(PageRequest.of(pnum,psize,Sort.by(name).descending()));
   return p.getContent();
   }
 
   
   public List<pharMod>getpharByname(String name)
     {
       return phre.getpharByname(name);
	}
   public List<pharMod> getpharByid(int id)
    {
		return phre.getpharByid(id);
		}
   @Transactional
   public int deletepharByname(String name)
   {
   	return phre.deletepharByname(name);
   }
   @Transactional
   public int updatepharByname(String name,int id)
   {
   	return phre.updatepharByname(name,id);
   }
   
   
}