package com.training.inheritance;

public class Car extends Vehicle {
	public Car(){
		super();
		System.out.println("Car contructor");
	}
	static int noOfWheels;
	public void getValues(){
		breakType = "Disk";
		speed = 150;
		color = "white";
		System.out.println("color:  "+color+"speed: "+speed);;
		getTopSpeed();
		
		
	}
	@Override
	public int getTopSpeed(){
		
		return 200;
		}

}
