package com.amdocs.backend;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.ZonedDateTime;
import java.time.*;


public class SLAAnalyzer 
{
    /**
    * Method will receive a particular problem opening date and amount of working hours (business hours) it should be solved and return the maximum date and time it should be solved.
    * It should be considered:
    * 	- Business hours are from 8AM to 5PM excluding weekends and holidays
    *  - Logic should consider only month of August 2019, Sao Carlos location
    *  - Method signature cannot be changed
    *  
    * @param iOpeningDateTime - Problem opening date
    * @param iSLA - Quantity of hours to solve the problem
    * @return Maximum date and time that problem should be solved
    */
    public LocalDateTime calculateSLA(LocalDateTime iOpeningDateTime, Integer iSLA)
    {
 
    	    //split the variable into each of the elements
    	    int yeariOpeningDateTime = iOpeningDateTime.getYear();
        	int monthiOpeningDateTime = iOpeningDateTime.getMonthValue();
        	int dayiOpeningDateTime = iOpeningDateTime.getDayOfMonth();
        	int houriOpeningDateTime = iOpeningDateTime.getHour();
        	int minuteOpeningDateTime = iOpeningDateTime.getMinute();
        	int secondiOpeningDateTime = iOpeningDateTime.getSecond();
        	//Year Validation
        	if ((yeariOpeningDateTime != 2019) || (monthiOpeningDateTime != 8) ) {
        		System.out.println("Date out of range: "+ iOpeningDateTime);
        	}
        	else if (yeariOpeningDateTime == 2019) {
        	//Validation Mondays to thursdays
        	  if ((dayiOpeningDateTime == 1) || (dayiOpeningDateTime >= 5 && dayiOpeningDateTime <= 8 ) || (dayiOpeningDateTime >= 12 && dayiOpeningDateTime <= 13 ) || (dayiOpeningDateTime >= 19 && dayiOpeningDateTime <= 22 ) || (dayiOpeningDateTime >= 25 & dayiOpeningDateTime <= 29 )) {
    			if (houriOpeningDateTime < 8) {
    				int houriOpeningDateTime2 = 16;
    				int minuteOpeningDateTime2 = 0;
    				int secondiOpeningDateTime2 = 0;
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime, houriOpeningDateTime2, minuteOpeningDateTime2, secondiOpeningDateTime2);
        			System.out.println("Maximum close date: "+ Maximum);
    			}
    			else if (houriOpeningDateTime >= 8 && houriOpeningDateTime < 9) {
    				int houriOpeningDateTime2 = houriOpeningDateTime + 8;
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime, houriOpeningDateTime2, minuteOpeningDateTime, secondiOpeningDateTime);
        			System.out.println("Maximum close date: "+ Maximum);
    			}
    			else if (houriOpeningDateTime >= 9 && houriOpeningDateTime < 17) {
        			int dayiOpeningDateTime2 = dayiOpeningDateTime + 1;
    				int houriOpeningDateTime2 = 8 + (8-(17 - houriOpeningDateTime));
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime2, houriOpeningDateTime2, minuteOpeningDateTime, secondiOpeningDateTime);
        			System.out.println("Maximum close date: "+ Maximum);
    			}
    			else if (houriOpeningDateTime > 17) {
    				int dayiOpeningDateTime2 = dayiOpeningDateTime + 1;
    				int houriOpeningDateTime2 = 16;
    				int minuteOpeningDateTime2 = 0;
    				int secondiOpeningDateTime2 = 0;
    				LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime2, houriOpeningDateTime2, minuteOpeningDateTime2, secondiOpeningDateTime2);
    				System.out.println("Maximum close date: "+ Maximum);
    			}
        	  }
    		//Validation Sundays and 15
    		  if (dayiOpeningDateTime == 4 || dayiOpeningDateTime == 11 || dayiOpeningDateTime == 15  || dayiOpeningDateTime == 18  || dayiOpeningDateTime == 25) {
    			int dayiOpeningDateTime2 = dayiOpeningDateTime + 1;
    			int houriOpeningDateTime2 = 16;
				int minuteOpeningDateTime2 = 0;
				int secondiOpeningDateTime2 = 0;
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime2, houriOpeningDateTime2, minuteOpeningDateTime2, secondiOpeningDateTime2);
    			System.out.println("Maximum close date: "+ Maximum);
    		  }
    		//Validation 14 
    		  if (dayiOpeningDateTime == 14) {
    			if (houriOpeningDateTime < 8) {
    				int houriOpeningDateTime2 = 16;
    				int minuteOpeningDateTime2 = 0;
    				int secondiOpeningDateTime2 = 0;
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime, houriOpeningDateTime2, minuteOpeningDateTime2, secondiOpeningDateTime2);
        			System.out.println("Maximum close date: "+ Maximum);
    			}
    			else if (houriOpeningDateTime >= 8 && houriOpeningDateTime < 9) {
    				int houriOpeningDateTime2 = houriOpeningDateTime + 8;
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime, houriOpeningDateTime2, minuteOpeningDateTime, secondiOpeningDateTime);
        			System.out.println("Maximum close date: "+ Maximum);
    			}
    			else if (houriOpeningDateTime >= 9 && houriOpeningDateTime < 17) {
        			int dayiOpeningDateTime2 = dayiOpeningDateTime + 2;
    				int houriOpeningDateTime2 = 8 + (8-(17 - houriOpeningDateTime));
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime2, houriOpeningDateTime2, minuteOpeningDateTime, secondiOpeningDateTime);
        			System.out.println("Maximum close date: "+ Maximum);
    			}
    			else if (houriOpeningDateTime > 17) {
    				int dayiOpeningDateTime2 = dayiOpeningDateTime + 2;
    				int houriOpeningDateTime2 = 16;
    				int minuteOpeningDateTime2 = 0;
    				int secondiOpeningDateTime2 = 0;
    				LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime2, houriOpeningDateTime2, minuteOpeningDateTime2, secondiOpeningDateTime2);
    				System.out.println("Maximum close date: "+ Maximum);
    			}
    		  }
    		
    		//Validation Saturdays
    		  if (dayiOpeningDateTime == 3 || dayiOpeningDateTime == 10 || dayiOpeningDateTime == 17  || dayiOpeningDateTime == 24) {
    			int dayiOpeningDateTime2 = dayiOpeningDateTime + 2;
    			int houriOpeningDateTime2 = 16;
				int minuteOpeningDateTime2 = 0;
				int secondiOpeningDateTime2 = 0;
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime2, houriOpeningDateTime2, minuteOpeningDateTime2, secondiOpeningDateTime2);
    			System.out.println("Maximum close date: "+ Maximum);
    		  }
    		//Validation Saturday 31
    		  if (dayiOpeningDateTime == 31) {
    			int monthiOpeningDateTime2 = monthiOpeningDateTime + 1;
    			int dayiOpeningDateTime2 = 2;
    			int houriOpeningDateTime2 = 16;
				int minuteOpeningDateTime2 = 0;
				int secondiOpeningDateTime2 = 0;
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime2, dayiOpeningDateTime2, houriOpeningDateTime2, minuteOpeningDateTime2, secondiOpeningDateTime2);
    			System.out.println("Maximum close date: "+ Maximum);
    		  }
    		//Validation Fridays
    		  if (dayiOpeningDateTime == 2 || dayiOpeningDateTime == 9 || dayiOpeningDateTime == 16  || dayiOpeningDateTime == 23) {
    			if (houriOpeningDateTime < 8) {
    				int houriOpeningDateTime2 = 16;
    				int minuteOpeningDateTime2 = 0;
    				int secondiOpeningDateTime2 = 0;
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime, houriOpeningDateTime2, minuteOpeningDateTime2, secondiOpeningDateTime2);
        			System.out.println("Maximum close date: "+ Maximum);
    			}
    			else if (houriOpeningDateTime >= 8 && houriOpeningDateTime < 9) {
    				int houriOpeningDateTime2 = houriOpeningDateTime + 8;
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime, houriOpeningDateTime2, minuteOpeningDateTime, secondiOpeningDateTime);
        			System.out.println("Maximum close date: "+ Maximum);
    			}
    			else if (houriOpeningDateTime >= 9 && houriOpeningDateTime < 17) {
        			int dayiOpeningDateTime2 = dayiOpeningDateTime + 3;
    				int houriOpeningDateTime2 = 8 + (8-(17 - houriOpeningDateTime));
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime2, houriOpeningDateTime2, minuteOpeningDateTime, secondiOpeningDateTime);
        			System.out.println("Maximum close date: "+ Maximum);
    			}
    			else if (houriOpeningDateTime >= 17) {
    				int dayiOpeningDateTime2 = dayiOpeningDateTime + 3;
    				int houriOpeningDateTime2 = 16;
    				int minuteOpeningDateTime2 = 0;
    				int secondiOpeningDateTime2 = 0;
        			LocalDateTime Maximum = LocalDateTime.of(yeariOpeningDateTime, monthiOpeningDateTime, dayiOpeningDateTime2, houriOpeningDateTime2, minuteOpeningDateTime2, secondiOpeningDateTime2);
        			System.out.println("Maximum close date: "+ Maximum);
    			}
    		  }
        	}
        	
			return iOpeningDateTime;

    }
      
}
