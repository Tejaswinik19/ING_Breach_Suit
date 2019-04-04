package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.domain.Breach;
import com.ing.service.BreachService;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@RequestMapping("api/v1/breach/")
public class BreachController {

@Autowired
private BreachService breach_service;	
	
	
@PostMapping("/add")
public ResponseEntity<Breach>  AddBreach(@RequestBody Breach breach) {
	Breach new_breach= breach_service.addBreach(breach);
	return ResponseEntity.ok().body(new_breach);

}	
@GetMapping("/breachList")
public ResponseEntity<List<Breach>> getBreaches(){
	List<Breach> breach_list= breach_service.listBreach();
	return ResponseEntity.ok(breach_list);
}
	
}
