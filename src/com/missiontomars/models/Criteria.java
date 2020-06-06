package com.missiontomars.models;

public class Criteria {
	private int jobId = 0;
	private String title = "";
	private int quantity;
	private int minAge;
	private int maxAge;
	private int workExperience;
	private String occupations = "";
	private String health = "";
	private String criminal = "";
	private String computer = "";
	private String languages = "";

	public Criteria(int jobId) {
		this.setJobId(jobId);
	}
	
	public Criteria() {
	}
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public int getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}
	public String getOccupations() {
		return occupations;
	}
	public void setOccupations(String occupations) {
		this.occupations = occupations;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getCriminal() {
		return criminal;
	}
	public void setCriminal(String criminal) {
		this.criminal = criminal;
	}
	public String getComputer() {
		return computer;
	}
	public void setComputer(String computer) {
		this.computer = computer;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	
}
