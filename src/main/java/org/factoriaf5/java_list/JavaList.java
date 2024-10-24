package org.factoriaf5.java_list;

import java.util.Collections;
import java.util.List;

public class JavaList {

	// Method to create the list with the days of the week
	public void createTheDaysOfTheWeek(List <String> daysOfTheWeek) {
		daysOfTheWeek.clear();
        daysOfTheWeek.add("Monday");
		daysOfTheWeek.add("Tuesday");
		daysOfTheWeek.add("Wednesday");
		daysOfTheWeek.add("Thursday");
		daysOfTheWeek.add("Friday");
		daysOfTheWeek.add("Saturday");
		daysOfTheWeek.add("Sunday");
	}

	// Method that returns the days of the week
	public List<String> returnTheDaysOfTheWeek(List<String> daysOfTheWeek) {
		createTheDaysOfTheWeek(daysOfTheWeek);
		return daysOfTheWeek;
	}

	// Method that returns the length of the list
	public long returnListlength(List<String> daysOfTheWeek) {
		createTheDaysOfTheWeek(daysOfTheWeek);
		long L = daysOfTheWeek.size();
		return L;
	}

	// Method to remove a day of the week
	public void deleteADayOfTheWeek(List<String> daysOfTheWeek, int pos){
		createTheDaysOfTheWeek(daysOfTheWeek);
		daysOfTheWeek.remove(pos);
	}

	// Method that returns the requested day of the week
	public String returnDesiredDay(List<String> daysOfTheWeek, int pos) {
		createTheDaysOfTheWeek(daysOfTheWeek);
		String desiredDay = daysOfTheWeek.get(pos);
		return desiredDay;
	}

	// Method that returns whether the requested day exists in the list
	public boolean returnDayExists(List<String> daysOfTheWeek, String day) {
		createTheDaysOfTheWeek(daysOfTheWeek);
		for(String pos : daysOfTheWeek) {
			if (pos.equals(day)){
				return true;
			}
		}
		return false;
	}

	// Method to sort the list of days in alphabetical order
	public void sortList(List<String> daysOfTheWeek) {
		createTheDaysOfTheWeek(daysOfTheWeek);
		Collections.sort(daysOfTheWeek);
	}

	// Method to clear the list
	public void emptyList(List<String> daysOfTheWeek) {
		createTheDaysOfTheWeek(daysOfTheWeek);
		daysOfTheWeek.clear();
	}
	
}