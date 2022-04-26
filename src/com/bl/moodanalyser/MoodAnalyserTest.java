package com.bl.moodanalyser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	
	@Test
	public void moodAnalyserSadTest() {
		MoodAnalyser msg = new MoodAnalyser();
		String actualresult = msg.moodAnalyse("I am in exhausted mood");
		assertEquals("SAD", actualresult);
	}
	
	@Test
	public void moodAnalyserHappyTest() {
		MoodAnalyser msg = new MoodAnalyser();
		String actualresult = msg.moodAnalyse("I am in happy mood");
		assertEquals("HAPPY", actualresult);
	}
	
	@Test
	public void moodAnalyserInvalidTest() {
		MoodAnalyser msg = new MoodAnalyser();
		String actualresult = msg.moodAnalyse("I don't know");
		assertEquals(null, actualresult);
	}

}
