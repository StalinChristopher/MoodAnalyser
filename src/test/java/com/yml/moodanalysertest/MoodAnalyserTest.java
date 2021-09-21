package com.yml.moodanalysertest;

import org.junit.Assert;
import org.junit.Test;

import com.yml.moodanalyser.MoodAnalyser;



public class MoodAnalyserTest {
	
	@Test
	public void sadTestCase() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in a sad mood");
		String expected = "SAD";
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void happyTestCase() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in Any mood");
		String expected = "HAPPY";
		Assert.assertEquals(expected, result);
	}
	
}
