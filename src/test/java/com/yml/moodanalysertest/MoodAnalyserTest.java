package com.yml.moodanalysertest;

import org.junit.Assert;
import org.junit.Test;

import com.yml.moodanalyser.MoodAnalyser;



public class MoodAnalyserTest {
	
	/**
	 * Test case to validate sad mood
	 */
	@Test
	public void sadTestCase() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a sad mood");
		String result = moodAnalyser.analyseMood();
		String expected = "SAD";
		Assert.assertEquals(expected, result);
	}
	
	/**
	 * Test case to validate any other mood
	 */
	@Test
	public void happyTestCase() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any mood");
		String result = moodAnalyser.analyseMood();
		String expected = "HAPPY";
		Assert.assertEquals(expected, result);
	}
	
	/**
	 * Test case to validate invalid mood
	 */
	@Test
	public void nullCheckTestCase() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood();
		String expected = "HAPPY";
		Assert.assertEquals(expected, result);
	}
	
}
