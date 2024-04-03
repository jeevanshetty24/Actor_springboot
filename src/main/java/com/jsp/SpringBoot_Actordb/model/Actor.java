package com.jsp.SpringBoot_Actordb.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity

@Table(name = "postman_db")
public class Actor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int actorId;
	private String actorName;
	private int actorAge;
	private String actorAddress;
	private String Industry;
	private String nationality;
	
	
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public int getActorAge() {
		return actorAge;
	}
	public void setActorAge(int actorAge) {
		this.actorAge = actorAge;
	}
	public String getActorAddress() {
		return actorAddress;
	}
	public void setActorAddress(String actorAddress) {
		this.actorAddress = actorAddress;
	}
	public String getIndustry() {
		return Industry;
	}
	public void setIndustry(String industry) {
		Industry = industry;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorAge=" + actorAge + ", actorAddress="
				+ actorAddress + ", Industry=" + Industry + ", nationality=" + nationality + "]";
	}
}
