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
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.CoronaCasesModel;
import com.springboot.app.model.HospitalModel;
import com.springboot.app.model.VaccineModel;
import com.springboot.app.repo.VaccineRepo;

@RestController
public class VaccineController {

	@Autowired
	VaccineRepo vaccinerepo;
	
	/*
	 * @GetMapping("/") public String getString(){ return "Success"; }
	 */
	
	@GetMapping("/alldetails")
	public List<VaccineModel> details(){
		return vaccinerepo.findAll();
	}
	
	@PostMapping("/addvaccine")
	public VaccineModel adddetails(@RequestBody VaccineModel vaccinemodel )
	{
		
		return vaccinerepo.save(vaccinemodel);
	}
	

	@GetMapping("/vaccine/{vaccineid}")
	public Optional<VaccineModel> vaccines(@PathVariable ("vaccineid") Long stateId){
		return vaccinerepo.findById(stateId);
	}
	@PutMapping("/vaccineput/{vid}")
	public VaccineModel update(@PathVariable ("vid") Long stateId,@RequestBody VaccineModel vaccinemodel ) {
		return vaccinerepo.save(vaccinemodel);
	}
	
	@DeleteMapping("/vaccinedel/{deid}")
	public String delete(@PathVariable ("deid") Long stateId) {
		
		vaccinerepo.deleteById(stateId);
		return "Succesfully deleted";
	}
}
