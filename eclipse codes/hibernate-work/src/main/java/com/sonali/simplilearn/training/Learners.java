package com.sonali.simplilearn.training;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;


@Entity //Makes this class bind to a table in the database
//@Table(name = "learnerDetails")
public class Learners {
	

	@Column(name = "learnerId") //Tells Hibernate to map this property to the column in table
	@GeneratedValue(strategy = GenerationType.IDENTITY) //For Auto-Increment columns
	@Id //Tells Hibernate this is our primary key in the table
	int learnerId;
	
	@Column(name = "learnerName")
	String learnerName;
	
	@Column(name = "learnerAddress")
	String learnerAddress;
	
//	@Embedded
//	private Skill skill;
//
//	public Skill getSkill() {
//		return skill;
//	}
//
//	public void setSkill(Skill skill) {
//		this.skill = skill;
//	}
	
	
	@ElementCollection
	@JoinTable(name = "learnerSkills")
	private List<Skill> listOfSkills = new ArrayList<>();

	public List<Skill> getListOfSkills() {
		return listOfSkills;
	}

	public void setListOfSkills(List<Skill> listOfSkills) {
		this.listOfSkills = listOfSkills;
	}

	public Learners(String learnerName, String learnerAddress) {
		this.learnerName = learnerName;
		this.learnerAddress = learnerAddress;
	}

	public void setLearnerId(int learnerId) {
		this.learnerId = learnerId;
	}

	public void setLearnerName(String learnerName) {
		this.learnerName = learnerName;
	}

	public void setLearnerAddress(String learnerAddress) {
		this.learnerAddress = learnerAddress;
	}

	public int getLearnerId() {
		return learnerId;
	}

	public String getLearnerName() {
		return learnerName;
	}

	public String getLearnerAddress() {
		return learnerAddress;
	}

	public Learners() {
		
	}
	
	@Override
	public String toString() {
		return "Learner [learnerId=" + learnerId + ", learnerName=" + learnerName + ", learnerAddress="
				+ learnerAddress + "]";
	}
	
	
}
