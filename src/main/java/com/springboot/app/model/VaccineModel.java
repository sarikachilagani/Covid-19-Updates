package com.springboot.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VaccineModel {

	@Id
	private Long stateId;
	private String stateName;
	private int dosesGiven;
	private int fullyVaccinated;
	
	public Long getStateId() {
		return stateId;
	}
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getDosesGiven() {
		return dosesGiven;
	}
	public void setDosesGiven(int dosesGiven) {
		this.dosesGiven = dosesGiven;
	}
	public int getFullyVaccinated() {
		return fullyVaccinated;
	}
	public void setFullyVaccinated(int fullyVaccinated) {
		this.fullyVaccinated = fullyVaccinated;
	}
	public VaccineModel(Long stateId,String stateName, int dosesGiven, int fullyVaccinated) {
		super();
		this.stateId=stateId;
		this.stateName = stateName;
		this.dosesGiven = dosesGiven;
		this.fullyVaccinated = fullyVaccinated;
	}
	public VaccineModel() {
		super();
	}
	
	
}
