package com.yml.moodanalyser;

public class MoodAnalyser {
	String message;
	
	public MoodAnalyser(){
		
	}
	
	public MoodAnalyser(String message){
		this.message = message;
	}
	
	/**
	 * @return
	 * Getter method to get the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 * Setter method to set the message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return
	 * Method to analyse given message and return happy or sad depending on the message
	 */
	public String analyseMood() {
		if(message.toLowerCase().contains("sad")) {
			return "SAD";
		}else {
			return "HAPPY";
		}
	}

}
