package com.usha;
/*1. To create two Java classes. Class 'Vehicle' and 'Car'. One of them will be an abstract class and the other one will extend the abstract class.
2. The abstract class will have two abstract functions - 'drive' and 'park'. And it will have data members: noOfWheels, colour, brand.
3. The child class will override the abstract functions and print the appropriate message as concrete implementation.
4. In the child class, assign values to the inherited data members via a parameterized constructor.
BONUS - In addition to the parameterized constructor, find a way to create an object of the implementing class without any parameters and to assign values via functions*/


public class Main {

	public static void main(String[] args) {
		
		
		Car car=new Car(4,"black","honda");
		
		System.out.println(car.getNoOfWheels());
		System.out.println(car.getColor());
		System.out.println(car.getBrand());
		car.drive();
		car.park();
		
		Car car2=new Car();
		car2.setNoOfWheels(4);
		car2.setColor("red");
		car2.setBrand("hero");
		
		System.out.println(car2.getNoOfWheels());
		System.out.println(car2.getColor());
		System.out.println(car2.getBrand());
		

	}


	}

	

	
	}

	

	


