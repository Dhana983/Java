package com.training.mars.power;

import java.util.ArrayList;
import java.util.List;


public class PowerBillApp {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Daine", 10, 0);
		Customer customer2 = new Customer(2, "Jenny", 200, 0);
		Customer customer3 = new Customer(3, "Amie", 210, 0);
		Customer customer4 = new Customer(4, "Mary", 510, 0);
		Customer customer5 = new Customer(5, "Allen", 1010, 0);
		
		List<Customer> customers = new ArrayList<Customer>();
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		
		for(Customer customer : customers){
			customer.setBillAmount(prepareCustomer(customer));
			if(customer.getBillAmount()>=50)
				System.out.println("Customer "+customer.getCustName()+" with ID: "+customer.getCustId()+" has to pay $"+customer.getBillAmount());
		}
		
	}
	
	public static double prepareCustomer(Customer customer){
			double finalAmount = 0;
			try {
				if(customer.getUnitsConsumed()<50)
					throw new MinimumNumberException();
				else{
					finalAmount = calcPowerBill(customer);
				}
			} catch (MinimumNumberException e) {
				System.out.println("Customer "+customer.getCustName()+" with ID: "+customer.getCustId()+" consumed less than 50 units.");
				e.printStackTrace();
			}
		
		return finalAmount;
	}
	
	public static double calcPowerBill(Customer customer){
		
		double finalAmount = 0;
		int units = customer.getUnitsConsumed();
		if(units<=200) finalAmount=50.00;
		else if(units>200 && units<=500) finalAmount=50+((units-200)*1.25);
		else if(units>500 && units<=1000) finalAmount=50+(300*1.25)+((units-500)*1.00);
		else if(units>1000) finalAmount=50+(300*1.25)+(500*1.00)+((units-1000)*0.75);
		
		return finalAmount;
	}
	

}
