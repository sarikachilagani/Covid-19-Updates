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
import com.springboot.app.repo.HospitalRepo;


@RestController
public class HospitalsAvailableController {
	@Autowired
	HospitalRepo hospitalrepo;
	
	@GetMapping("/allhospitals")
	public List<HospitalModel> allHospitals(){
		return hospitalrepo.findAll();
	}
	
	@PostMapping("/addhospitals")
	public HospitalModel addHospitals(@RequestBody 
			HospitalModel hospitalmodel) {
		return hospitalrepo.save(hospitalmodel);
	}

	@GetMapping("/hospget/{stateid}")
	public Optional<HospitalModel> cases(@PathVariable ("stateid") Long stateId){
		return hospitalrepo.findById(stateId);
	}
	@PutMapping("/hospput/{hid}")
	public HospitalModel update(@PathVariable ("hid") Long stateId,@RequestBody HospitalModel hospitalmodel ) {
		return hospitalrepo.save(hospitalmodel);
	}
	
	@DeleteMapping("/hospdel/{delid}")
	public String delete(@PathVariable ("delid") Long stateId) {
		
		hospitalrepo.deleteById(stateId);
		return "Succesfully deleted";
	}
}
