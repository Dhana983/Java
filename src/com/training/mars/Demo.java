package com.training.mars;

public class Demo {

	public static void main(String[] args) {
		System.out.println("welcome");
		int a = 0,b = 0;
		System.out.println("Addition"+(a+b));
		System.out.println("Substraction"+(a-b));


		constructorExample p1 = new constructorExample();
		p1.setHeight(150);
		p1.setWeight(200);
		System.out.println(p1.getPersonInfo());
		constructorExample p2 = new constructorExample();
		p2.setHeight(150);
		p2.setWeight(200);
	}
	

}
