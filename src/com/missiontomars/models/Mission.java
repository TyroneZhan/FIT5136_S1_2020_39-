package com.missiontomars.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mission {
	private int id = 0;
	private String name = "";
	private int shuttleId = 0;
	private String description = "";
	private String countryOfOrigin = "";
	private String countriesAllowed = "";
	private int coordinatorId = 0;
	private String cargoRequirements = "";
	private Date launchDate = new Date();
	private String destinationAddress = "";
	private int durationOfMission = 10;
	private String status = "planning_phase";

	public int getShuttleId() {
		return shuttleId;
	}
	public void setShuttleId(int shuttleId) {
		this.shuttleId = shuttleId;
	}
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
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getCountriesAllowed() {
		return countriesAllowed;
	}
	public void setCountriesAllowed(String countriesAllowed) {
		this.countriesAllowed = countriesAllowed;
	}
	public int getCoordinatorId() {
		return coordinatorId;
	}
	public void setCoordinatorId(int coordinatorId) {
		this.coordinatorId = coordinatorId;
	}
	public String getCargoRequirements() {
		return cargoRequirements;
	}
	public void setCargoRequirements(String cargoRequirements) {
		this.cargoRequirements = cargoRequirements;
	}
	public Date getLaunchDate() {
		return launchDate;
	}
	public String getLaunchDateStr() {
		if(this.launchDate == null) {
			return "-";
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(this.launchDate);
	}
	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}
	public String getDestinationAddress() {
		return destinationAddress;
	}
	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}
	public int getDurationOfMission() {
		return durationOfMission;
	}
	public void setDurationOfMission(int durationOfMission) {
		this.durationOfMission = durationOfMission;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
