package com.springboot.app.model;

import java.util.Date;

//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Corona")
public class CoronaCasesModel {
	@Id
	private long stateId;

	private int totalConfirmedCases;

	private int recoveredCases;
	private String stateName;

	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name="updateddate")
	private Date recordedDate=new Date(System.currentTimeMillis());

	/*
	 * @Temporal(TemporalType.DATE)
	 * 
	 * @JsonFormat(pattern = "yyyy-MM-dd") private Date updatedDate;
	 */
	public long getStateId() {
		return stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public int getTotalConfirmedCases() {
		return totalConfirmedCases;
	}

	public void setTotalConfirmedCases(int totalConfirmedCases) {
		this.totalConfirmedCases = totalConfirmedCases;
	}

	public int getRecoveredCases() {
		return recoveredCases;
	}

	public void setRecoveredCases(int recoveredCases) {
		this.recoveredCases = recoveredCases;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Date getRecordedDate() {
		return recordedDate;
	}

	public void setRecordedDate(Date recordedDate) {
		this.recordedDate = recordedDate;
	}

	/*
	 * public Date getUpdatedDate() { return updatedDate; }
	 * 
	 * public void setUpdatedDate(Date updatedDate) { this.updatedDate =
	 * updatedDate; }
	 */

	public CoronaCasesModel(long stateId, int totalConfirmedCases, int recoveredCases, String stateName,
			Date recordedDate) {
		super();
		this.stateId = stateId;
		this.totalConfirmedCases = totalConfirmedCases;
		this.recoveredCases = recoveredCases;
		this.stateName = stateName;
		this.recordedDate = recordedDate;
	}

	public CoronaCasesModel() {
		super();

	}

}
