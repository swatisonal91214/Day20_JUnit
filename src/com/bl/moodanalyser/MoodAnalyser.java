package com.bl.moodanalyser;

public class MoodAnalyser {
	
	public String moodAnalyse(String msg) {
		String resultmsg = null;
		if(msg.toLowerCase().contains("happy") || msg.toLowerCase().contains("excited")) {
			System.out.println("Happy Mood");
			resultmsg = "HAPPY";
		}else if(msg.toLowerCase().contains("sad")|| msg.toLowerCase().contains("exhausted")) {
			System.out.println("Sad Mood");
			resultmsg = "SAD";
		}else {
			System.out.println("Invalid input");
		}
		return resultmsg;
		
	}

}
