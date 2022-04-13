package com.training.mars;
import java.util.Scanner;

public class DataTypesDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n= scanner.nextInt();



		int arr[]=new int[n];   
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();    
		}

		System.out.println("The Even Elements are...");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)   
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println(" ");


		System.out.println("The Odd Elements are...");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0)   
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}


