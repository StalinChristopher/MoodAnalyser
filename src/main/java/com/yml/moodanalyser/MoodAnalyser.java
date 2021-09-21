package com.yml.moodanalyser;

public class MoodAnalyser {
	String message;
	
	public MoodAnalyser(){
		this.message = null;
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
	 * Method to analyse given message and return happy or sad depending on the message and if null then return Happy
	 * after catching NullPointer exception
	 */
	public String analyseMood() {
		try {
			if(message.toLowerCase().contains("sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
		} catch(NullPointerException e) {
			return "HAPPY";
			
		}
		
	}

}
