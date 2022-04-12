package com.training.mars;
import java.util.Scanner;

public class BasicsDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
         int age = 21;
         if(age<18){
        	 System.out.println("not eligible to vote");
         }
         else{
        	 System.out.println("Eligible to vote");
         }

	}

}
