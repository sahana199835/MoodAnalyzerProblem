package com.bridgelabz.MoodAnalyzerProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {
	
	@Test
	public void testAnalysisMoodSad() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("SAD", mood);
	}
}



