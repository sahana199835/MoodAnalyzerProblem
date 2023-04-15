package com.bridgelabz.MoodAnalyzerProblem;

public class MoodAnalyzer {
	
	import java.util.HashMap;
	import java.util.Map;

		private String message; // Field to store the mood message
	enum MoodEnum {
		HAPPY("happy"), SAD("sad"), ANGRY("angry"), NEUTRAL("neutral");

		// Default constructor
		public MoodAnalyser() {
			message = ""; // Set default empty message
		private String value;
		private static Map<String, MoodEnum> map = new HashMap<>();

		static {
			for (MoodEnum mood : MoodEnum.values()) {
				map.put(mood.value, mood);
			}
		}

		// Constructor with message parameter
		public MoodAnalyser(String message) {
			this.message = message; // Set the message field with the passed parameter
		MoodEnum(String value) {
			this.value = value;
		}

		// Analysis mood method using the message field
		public String analysisMood() {
			try {
				if (message == null || message.isEmpty()) {
					throw new InvalidMoodException("Invalid mood: Mood message cannot be null or empty.");
				} else if (message.contains("Sad")) {
					return "SAD";
				} else {
					return "HAPPY";
				}
			} catch (InvalidMoodException e) {
				// Handle the exception and return "HAPPY" as default value
				System.out.println(e.getMessage());
				return "HAPPY";
			}
		public String getValue() {
			return value;
		}

		public static MoodEnum fromValue(String value) {
			return map.get(value.toLowerCase());
		}
	}

	// Define MoodAnalyzer class
	class MoodAnalyzer {
		public String analyzeMood(String mood) throws MoodAnalysisException {
			// Check if mood is null or empty
			if (mood == null || mood.trim().isEmpty()) {
				throw new MoodAnalysisException("Invalid Mood: Mood cannot be empty or null.");
			}

			// Convert mood to lowercase for case-insensitive comparison
			mood = mood.toLowerCase();

			// Check if mood is valid using Enum
			MoodEnum moodEnum = MoodEnum.fromValue(mood);
			if (moodEnum == null) {
				throw new MoodAnalysisException("Invalid Mood: Mood not recognized.");
			}

			// Return the analyzed mood
			return mood;
		}
	}
	 
	