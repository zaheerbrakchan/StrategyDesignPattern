package com.design.pattern.parentClass;

import com.design.pattern.strategies.DriveStrategy;

public class Vehicle {
	
	DriveStrategy driveStrategy;
	
	//constructor injection we are doing here
	public Vehicle(DriveStrategy driveStrategy){
		this.driveStrategy=driveStrategy;
	}
	
  public void drive() {
	  driveStrategy.drive();
  }
}
