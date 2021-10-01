package com.simplilearn;

public class MainPage {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe.com");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
