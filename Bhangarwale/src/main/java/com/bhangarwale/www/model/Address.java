package com.bhangarwale.www.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	

	
	@Column(name = "pinCode")
	private String pinCode;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "plotNo")
	private String plotNo;
	
	@Column(name = "societyOrColony")
	private String societyOrColony;
	
	@Column(name = "nagar")
	private String nagar;
	

	
	



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getPinCode() {
		return pinCode;
	}



	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPlotNo() {
		return plotNo;
	}



	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}



	public String getSocietyOrColony() {
		return societyOrColony;
	}



	public void setSocietyOrColony(String societyOrColony) {
		this.societyOrColony = societyOrColony;
	}



	public String getNagar() {
		return nagar;
	}



	public void setNagar(String nagar) {
		this.nagar = nagar;
	}



	


	
	

}
