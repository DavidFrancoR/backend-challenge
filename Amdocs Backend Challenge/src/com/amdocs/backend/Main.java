package com.amdocs.backend;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Integer iSLA = 8;
		System.out.println("Enter the date in the format: ISO_LOCAL_DATE_TIME '2019-08-01T02:00:00.000'");
    	Scanner scTemporary = new Scanner(System.in);
    	String iOpeningDateTime1 = scTemporary.nextLine();
		LocalDateTime iOpeningDateTime = LocalDateTime.parse(iOpeningDateTime1);

    	SLAAnalyzer op = new SLAAnalyzer();
    	op.calculateSLA(iOpeningDateTime, iSLA);

	}

}
