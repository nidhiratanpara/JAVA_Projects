package com.nidhi.RestApp.messanger.database;

import java.util.HashMap;
import java.util.Map;

import com.nidhi.RestApp.messanger.model.Message;
import com.nidhi.RestApp.messanger.model.Profile;

public class DataBaseClass {
	
	private static Map<Long,Message> messages=new HashMap<>();
	private static Map<Long,Profile> profiles=new HashMap<>();
	
	public static Map<Long,Message> getMessages()
	{
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles()
	{
		return profiles;
	}

}
