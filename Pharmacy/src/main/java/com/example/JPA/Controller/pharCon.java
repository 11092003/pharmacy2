package com.example.JPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.Model.pharMod;
import com.example.JPA.Service.pharserv;

@RestController
public class pharCon {
  
	@Autowired
	
	pharserv servi;
	//@Tag(name="Getting",description ="Getting values")
	@GetMapping("/login")
	public List<pharMod> main(){
		return servi.main();
	}
	//@Tag(name="Posting",description ="Posting values ")
	@PostMapping("/signin")
	public pharMod sub(@RequestBody pharMod ph) {
		return servi.sub(ph);
	}
	//@Tag(name="Updating",description ="Updating values ")
	@PutMapping("/signup/{id}")
	public pharMod dub(@RequestBody pharMod ph) {
		return servi.dub(ph);
	}
	//@Tag(name="Deleting",description ="Deleting values")
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable("id") int cost) {
		servi.del(cost);
	}
	//sorting by descending order
	//@Tag(name="sorting",description ="Sorting the values ")
	@GetMapping("/sort/{name}")
	public List<pharMod> sorting(@PathVariable("name") String name){
		return servi.sorting(name);
	}
	//pagination
	//@Tag(name=" Paginating ",description =" Paging")
	@GetMapping("/page/{pnum}/{psize}")
	public List<pharMod> page(@PathVariable("pnum") int num,@PathVariable("psize") int pgsize){
		return servi.page(num,pgsize);
	}
	//pagination sorting
	//@Tag(name=" Paginationsorting ",description ="Pagination Sorting")
	@GetMapping("/paginationsort/{pnum}/{psize}/{name}")
	public List<pharMod> paginationsorting(@PathVariable("pnum")int pnum,@PathVariable("psize")int psize,@PathVariable("name")String name)

	{
		return servi.paginationsorting(pnum,psize,name);
	}
	

	
	//@Tag(name=" Getting Jpql ",description ="Getting using Jpql queries By name")
	@GetMapping("/select")
    public List<pharMod>getpharByname(@RequestParam String name)
    {
    	return servi.getpharByname(name);
    }
    //@Tag(name=" Getting Jpql ",description ="Getting using Jpql queries by id ")
    @GetMapping("/getById")
    public List<pharMod>getpharByid(@RequestParam int id)
    {
   	return servi.getpharByid(id);
    }
    //@Tag(name="Deleting jpql",description ="Deleting using jpql queries by name")
    @DeleteMapping("/deleteByname")
    public String deletepharByname(@RequestParam String name)
    {
    int result=servi.deletepharByname(name)	;
    if(result >0)
   	return "Medicie record deleted";
   else
    	return "Problem occured while deleting";
    }
    //@Tag(name="Updating jpql",description ="Updating using jpql by name")
    @PutMapping("/updateByname")
    public int updatepharByname(@RequestParam String name,@RequestParam int id)
    {
    	return servi.updatepharByname(name,id);
    }
	
//	
//	
 
}
