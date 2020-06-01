package com.missiontomars.enums;

public enum UserRole {
	ADMIN(1, "admin"),
	COORDINATOR(2, "coordinator"),
	CANDIDATE(3, "candidate");
	
	int id;
	
	String name;

	private UserRole(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
