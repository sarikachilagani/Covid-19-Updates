package com.springboot.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.model.HospitalModel;



@Repository
public interface HospitalRepo extends JpaRepository<HospitalModel,Long> {

}
