package com.simplilearn;

public class MenuOptions {

	public static void printWelcomeScreen(String appName) {
		String companyDetails = String.format("----------------------------------------------------------------\n"
				+ "                    Welcome to %s \n"
				+ "----------------------------------------------------------------\n", appName);
		String appFunction = "You can use this application to :-\n"
				+ "• Retrieve all file names.\n"
				+ "• Search, add, or delete files.\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\n****** Select any option number from below ******\n\n"
				+ "1) Retrieve all files\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n****** Select any option number from below ******\n\n"
				+ "1) Add a file\n" + "2) Delete a file\n"
				+ "3) Search for a file\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}

}
