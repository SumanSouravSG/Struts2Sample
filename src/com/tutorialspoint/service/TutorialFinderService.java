package com.tutorialspoint.service;

public class TutorialFinderService {
	
	public String getBestTutorial(String language){
		
		if(language.equalsIgnoreCase("java"))
			return "Journal Dev";
		else if(language.equalsIgnoreCase("dotnet"))
			return "Java Brains";
		else
			return "launguage not set";
	}
}
