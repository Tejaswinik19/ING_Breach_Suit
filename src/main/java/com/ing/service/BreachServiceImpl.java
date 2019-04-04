package com.ing.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.Breach;
import com.ing.repository.BreachRepository;

@Service
public class BreachServiceImpl  implements BreachService{
	
	
	@Autowired
	private BreachRepository breach_repo;
	
	public Breach addBreach(Breach brach) {
		return  breach_repo.save(brach);
	}	
	
	public List<Breach> listBreach(){
		
	 List<Breach> breach_l=new ArrayList<Breach>();
	  Iterable<Breach> breach_list=breach_repo.findAll();
	  for(Breach br :breach_list){
	   breach_l.add(br);
	  }
	
	  return breach_l;
}


}
