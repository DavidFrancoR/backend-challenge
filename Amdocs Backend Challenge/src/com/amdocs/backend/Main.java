package com.amdocs.backend;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Integer iSLA = 8; //@param iSLA - Quantity of hours to solve the problem
		System.out.println("Enter the date in the format: ISO_LOCAL_DATE_TIME '2019-08-01T02:00:00.000'"); //Request a date to evaluate
    	Scanner scTemporary = new Scanner(System.in);
    	String iOpeningDateTime1 = scTemporary.nextLine();
		LocalDateTime iOpeningDateTime = LocalDateTime.parse(iOpeningDateTime1); //@param iOpeningDateTime - Problem opening date

		//Pass the variables to SLAAnalyzer 
    	SLAAnalyzer op = new SLAAnalyzer();
    	op.calculateSLA(iOpeningDateTime, iSLA);

	}

}
