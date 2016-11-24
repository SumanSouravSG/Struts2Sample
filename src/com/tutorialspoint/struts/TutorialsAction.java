package com.tutorialspoint.struts;

import com.opensymphony.xwork2.Action;
import com.tutorialspoint.service.TutorialFinderService;

public class TutorialsAction implements Action{
	
	private String besttutorialSite;
	private String language;
	
	public String execute(){
		System.out.println("Hiiiiiiiiii");
		
		TutorialFinderService tutorialfinder = new TutorialFinderService();
		setBesttutorialSite(tutorialfinder.getBestTutorial(getLanguage()));
		
		return SUCCESS;
	}

	public String getBesttutorialSite() {
		return besttutorialSite;
	}

	public void setBesttutorialSite(String besttutorialSite) {
		this.besttutorialSite = besttutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
