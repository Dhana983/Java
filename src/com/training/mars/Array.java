package com.training.mars;

public class Array {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int [][] numbers =  new int[3][];
				numbers[0] = new int[4];
				numbers[1] = new int[5];
				numbers[2] = new int[4];
				for (int i=0;i<numbers.length;i++){
					for (int j=0;j<numbers[i].length;j++){
						numbers[i][j]= i*2+j;
					}
				}
				for (int i=0;i<numbers.length;i++){
					for (int j=0;j<numbers[i].length;j++){
						System.out.print(numbers[i][j]+(" "));
					}
					System.out.println(" ");
				}
			}
		}

	


