package com.springboot.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.model.VaccineModel;


@Repository
public interface VaccineRepo extends JpaRepository<VaccineModel,Long> {

	Optional<VaccineModel> findById(Long stateId);

	void deleteById(Long stateId) ;
		
	

}
