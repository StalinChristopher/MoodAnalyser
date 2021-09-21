package com.yml.moodanalysertest;

import org.junit.Assert;
import org.junit.Test;
import com.yml.moodanalyser.MoodAnalyser;
import com.yml.moodanalyser.MoodAnalyser.Errors;
import com.yml.moodanalyser.MoodAnalyserException;



public class MoodAnalyserTest {
	
	/**
	 * Test case to validate sad mood
	 */
	@Test
	public void sadTestCase() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a sad mood");
			String result = moodAnalyser.analyseMood();
			String expected = "SAD";
			Assert.assertEquals(expected, result);
		} catch(MoodAnalyserException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Test case to validate any other mood
	 */
	@Test
	public void happyTestCase() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any mood");
			String result = moodAnalyser.analyseMood();
			String expected = "HAPPY";
			Assert.assertEquals(expected, result);
		} catch(MoodAnalyserException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Test case to validate invalid mood
	 */
	@Test
	public void nullCheckTestCase() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			moodAnalyser.analyseMood();
		} catch(MoodAnalyserException e) {
			String result = e.getMessage();
			String expected = Errors.NULL_MOOD.toString();
			Assert.assertEquals(expected, result);
		}	
	}
	
	/**
	 * Test case to validate empty string
	 */
	@Test
	public void emptyCheckTestCase() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser("");
			moodAnalyser.analyseMood();
		} catch(MoodAnalyserException e) {
			String result = e.getMessage();
			String expected = Errors.EMPTY_MOOD.toString();
			Assert.assertEquals(expected, result);
		}	
	}
	
}
