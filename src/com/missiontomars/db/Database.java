package com.missiontomars.db;

import java.util.ArrayList;
import java.util.List;

import com.missiontomars.models.Candidate;
import com.missiontomars.models.Mission;
import com.missiontomars.models.MissionJob;
import com.missiontomars.models.Shuttle;
import com.missiontomars.models.User;

public class Database {
	private List<User> users = new ArrayList<User>();
	private List<Mission> missions = new ArrayList<Mission>();
	private List<MissionJob> missionJobs = new ArrayList<MissionJob>();
	private List<Shuttle> shuttles = new ArrayList<Shuttle>();
	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	private List<Candidate> candidates = new ArrayList<Candidate>();
	
	public Database() {
		Shuttle shuttle1 = new Shuttle();
		shuttle1.setId(1);
		shuttle1.setName("Magna Sed");
		shuttle1.setManufactureYear(2019);
		shuttle1.setFuelCapacity(2000);
		shuttle1.setPassengerCapacity(10);
		shuttle1.setCargoCapacity(7);
		shuttle1.setSpeed(20);
		shuttle1.setOrigin("Russian");
		shuttles.add(shuttle1);

		Shuttle shuttle2 = new Shuttle();
		shuttle2.setId(2);
		shuttle2.setName("CHA");
		shuttle2.setManufactureYear(2018);
		shuttle2.setFuelCapacity(1200);
		shuttle2.setPassengerCapacity(6);
		shuttle2.setCargoCapacity(5);
		shuttle2.setSpeed(26);
		shuttle2.setOrigin("China");
		shuttles.add(shuttle2);

		Shuttle shuttle3 = new Shuttle();
		shuttle3.setId(3);
		shuttle3.setName("Shuttle 3");
		shuttle3.setManufactureYear(2020);
		shuttle3.setFuelCapacity(3000);
		shuttle3.setPassengerCapacity(12);
		shuttle3.setCargoCapacity(10);
		shuttle3.setSpeed(18);
		shuttle3.setOrigin("USA");
		shuttles.add(shuttle3);

		Shuttle shuttle4 = new Shuttle();
		shuttle4.setId(4);
		shuttle4.setName("Shuttle 4");
		shuttle4.setManufactureYear(2018);
		shuttle4.setFuelCapacity(1600);
		shuttle4.setPassengerCapacity(6);
		shuttle4.setCargoCapacity(7);
		shuttle4.setSpeed(22);
		shuttle4.setOrigin("China");
		shuttles.add(shuttle4);
		
		Shuttle shuttle5 = new Shuttle();
		shuttle5.setId(5);
		shuttle5.setName("Shuttle 5");
		shuttle5.setManufactureYear(2020);
		shuttle5.setFuelCapacity(4000);
		shuttle5.setPassengerCapacity(16);
		shuttle5.setCargoCapacity(16);
		shuttle5.setSpeed(20);
		shuttle5.setOrigin("China");
		shuttles.add(shuttle5);
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public List<Mission> getMissions() {
		return missions;
	}

	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}

	public List<Shuttle> getShuttles() {
		return shuttles;
	}

	public List<MissionJob> getMissionJobs() {
		return missionJobs;
	}

	public void setMissionJobs(List<MissionJob> missionJobs) {
		this.missionJobs = missionJobs;
	}
	
	public Mission findMissionByPk(Integer missionId) {
		for(Mission mission : this.missions) {
			if(mission.getId() == missionId) {
				return mission;
			}
		}
		return null;
	}
	
	public ArrayList<MissionJob> getMissionJobsByMissionId(Integer missionId) {
		ArrayList<MissionJob> list = new ArrayList<MissionJob>();
		for(MissionJob missionJob : this.missionJobs) {
			if(missionJob.getMissionId() == missionId) {
				list.add(missionJob);
			}
		}
		return list;
	}
}
