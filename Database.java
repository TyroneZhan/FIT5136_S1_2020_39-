ackage com.missiontomars.db;

import java.util.ArrayList;
import java.util.List;

import com.missiontomars.models.Mission;
import com.missiontomars.models.MissionJob;
import com.missiontomars.models.User;

public class Database {
	private List<User> users = new ArrayList<User>();
	private List<Mission> missions = new ArrayList<Mission>();
	private List<MissionJob> missionJobs = new ArrayList<MissionJob>();

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
}
