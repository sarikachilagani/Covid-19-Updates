package com.springboot.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "hospitals")
public class HospitalModel {
	@Id
	private long stateId;
	private String stateName;

	private int noOfHospitals;

	private int occupiedBeds;
	private int availableBeds;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name="updateddate")
	private Date recordedDate=new Date(System.currentTimeMillis());

	public long getStateId() {
		return stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getNoOfHospitals() {
		return noOfHospitals;
	}

	public void setNoOfHospitals(int noOfHospitals) {
		this.noOfHospitals = noOfHospitals;
	}

	public int getOccupiedBeds() {
		return occupiedBeds;
	}

	public void setOccupiedBeds(int occupiedBeds) {
		this.occupiedBeds = occupiedBeds;
	}

	public int getAvailableBeds() {
		return availableBeds;
	}

	public void setAvailableBeds(int availableBeds) {
		this.availableBeds = availableBeds;
	}

	public Date getRecordedDate() {
		return recordedDate;
	}

	public void setRecordedDate(Date recordedDate) {
		this.recordedDate = recordedDate;
	}

	public HospitalModel(long stateId, String stateName, int noOfHospitals, int occupiedBeds, int availableBeds,
			Date recordedDate) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.noOfHospitals = noOfHospitals;
		this.occupiedBeds = occupiedBeds;
		this.availableBeds = availableBeds;
		this.recordedDate = recordedDate;
	}

	public HospitalModel() {
		super();
		
	}
	
	
	
	
	
}
