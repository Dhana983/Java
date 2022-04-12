package com.training.mars;
import java.util.Scanner;

public class patternNumbers {
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		pattern();
		secondPattern();
	}
	private static void pattern(){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}

}
	private static void secondPattern(){
		int k=1;
		for(int i=1;i<=3;i++)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(k);
		k++;
		}
		System.out.println();
		}
	}
	}
