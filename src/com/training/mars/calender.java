package com.training.mars;
import java.util.Scanner;

public class calender {
	


	public static void main(String[] args) {
		
        numberOfMonth();
        
        
	}
	
	public static void numberOfMonth() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The monthNumber: ");
        int month= scanner.nextInt();
        System.out.println("Enter The year: ");
        int year = scanner.nextInt();
		String nameOfMonth = null; ;
		int number_Of_DaysInMonth=0;
	    switch (month) {
	        case 1:
	            nameOfMonth = "January";
	            number_Of_DaysInMonth = 31;
	            break;
	        case 2:
	            nameOfMonth = "February";
	            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	                number_Of_DaysInMonth = 29;
	            } else {
	                number_Of_DaysInMonth = 28;
	            }
	            break;
	        case 3:
	            nameOfMonth = "March";
	            number_Of_DaysInMonth = 31;
	            break;
	        case 4:
	            nameOfMonth = "April";
	            number_Of_DaysInMonth = 30;
	            break;
	        case 5:
	            nameOfMonth = "May";
	            number_Of_DaysInMonth = 31;
	            break;
	        case 6:
	            nameOfMonth = "June";
	            number_Of_DaysInMonth = 30;
	            break;
	        case 7:
	            nameOfMonth = "July";
	            number_Of_DaysInMonth = 31;
	            break;
	        case 8:
	            nameOfMonth = "August";
	            number_Of_DaysInMonth = 31;
	            break;
	        case 9:
	            nameOfMonth = "September";
	            number_Of_DaysInMonth = 30;
	            break;
	        case 10:
	            nameOfMonth = "October";
	            number_Of_DaysInMonth = 31;
	            break;
	        case 11:
	            nameOfMonth = "November";
	            number_Of_DaysInMonth = 30;
	            break;
	        case 12:
	            nameOfMonth = "December";
	            number_Of_DaysInMonth = 31;
	    
	    }
	    System.out.println(nameOfMonth+" "+ year +" has "+ number_Of_DaysInMonth +" days.");
	}
}