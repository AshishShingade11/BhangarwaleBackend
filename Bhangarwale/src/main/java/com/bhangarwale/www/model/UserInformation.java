package com.bhangarwale.www.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class UserInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name="";
	
	@Column(name = "phoneNumber")
	private String phoneNumber="";
	
	@Column(name = "profileImage")
	private String profileImage="";
	
	@Column(name = "createdTime")
	private long createdTime;
	
	
	@Column(name = "updatedTime")
	private long updatedTime;

	
	@OneToMany(targetEntity = Address.class,cascade = {CascadeType.ALL})
	Set<Address> addresses=null;
	
	

	public Set<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}


	public long getCreatedTime() {
		return createdTime;
	}


	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}


	public long getUpdatedTime() {
		return updatedTime;
	}


	public void setUpdatedTime(long updatedTime) {
		this.updatedTime = updatedTime;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	

}
