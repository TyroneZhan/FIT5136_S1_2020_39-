package com.missiontomars.db;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DbOperator {
	private static ObjectMapper mapper = new ObjectMapper();
	private static Database db;
	private static String filePath = DbOperator.class.getClassLoader().getResource("../dbs/db.txt").getFile();
	
	public static Database getDatabase() throws JsonParseException, JsonMappingException, IOException {
		if(db == null) {
			File file = new File(filePath);
			db = mapper.readValue(file, Database.class);
		}
		return db;
	}
	
	public static void flush() throws JsonGenerationException, JsonMappingException, IOException {
		File file = new File(filePath);
		mapper.writeValue(file, db);
	}
}
