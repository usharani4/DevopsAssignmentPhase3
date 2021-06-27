package com.usha;

public class Car extends Vehicle{
	
	public Car()
	{
		super();
	}
	
	public Car(int noOfWheels, String color, String brand) {
		super();
		this.noOfWheels = noOfWheels;
		this.color = color;
		this.brand = brand;
	}

	

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWeels) {
		this.noOfWheels = noOfWeels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	

	@Override
	public void drive() {
	System.out.println("Car is driving mode");
		
	}

	@Override
	public void park() {
	System.out.println("Car is parked");
		
	
	}

	
	}


