package com.missiontomars.models;

public class MissionJob {
	private int id;
	private String name;
	private String description;
	private int missionId;
	private int requiredNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMissionId() {
		return missionId;
	}
	public void setMissionId(int missionId) {
		this.missionId = missionId;
	}
	public int getRequiredNumber() {
		return requiredNumber;
	}
	public void setRequiredNumber(int requiredNumber) {
		this.requiredNumber = requiredNumber;
	}
	
}
