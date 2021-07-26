package com.springboot.app.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.CoronaCasesModel;
import com.springboot.app.repo.CoronaCasesRepo;

@RestController
//@RequestMapping("/user")
public class CoronaCasesController {

	@Autowired
	CoronaCasesRepo coronarepo;
	
	@GetMapping("/allcases")
	public List<CoronaCasesModel> allcases(){
		return coronarepo.findAll();
	}
	
	@GetMapping("/get/{caseid}")
	public Optional<CoronaCasesModel> cases(@PathVariable ("caseid") Long stateId){
		return coronarepo.findById(stateId);
	}
	
	
	@PostMapping("/add")
	public CoronaCasesModel addcases(@RequestBody CoronaCasesModel coronacases )
	{
		return coronarepo.save(coronacases);
	}
	
	@PutMapping("/put/{id}")
	public CoronaCasesModel update(@PathVariable ("id") Long stateId,@RequestBody CoronaCasesModel coronacases ) {
		System.out.println(stateId);
		return coronarepo.save(coronacases);
	}
	
	@DeleteMapping("/delete/{id}")
	public  String delete(@PathVariable ("id") Long stateId) {
		
		coronarepo.deleteById(stateId);
		return "Succesfully deleted";
	}
	
}
