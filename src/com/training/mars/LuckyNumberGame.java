package com.training.mars;
import java.util.Scanner;

public class LuckyNumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Lucky Number: ");
         int Number = scanner.nextInt();
         int luckyNumber=6;
         int attempts=1;
         if(luckyNumber==Number)
         {
        	 System.out.println("print the lucky number");
        	System.out.println("number of times the number guesses"+ attempts); 
         }
         else{
        	 attempts++;
        	 System.out.println("missed the number");
         }
         
	}

}
