package com.sonali.simplilearn.training;

import javax.persistence.Embeddable;

@Embeddable
public class Skill {

	Skill() {

	}

	public Skill(String skillName, String skillRating) {
		this.skillName = skillName;
		this.skillRating = skillRating;
	}

	private String skillName;

	private String skillRating;

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillRating() {
		return skillRating;
	}

	public void setSkillRating(String skillRating) {
		this.skillRating = skillRating;
	}
}
