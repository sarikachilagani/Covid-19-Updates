package com.springboot.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.model.CoronaCasesModel;

@Repository
public interface CoronaCasesRepo extends JpaRepository<CoronaCasesModel,Long>{

	

}
