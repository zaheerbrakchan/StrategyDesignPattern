package com.design.pattern.childClasses;

import com.design.pattern.parentClass.Vehicle;
import com.design.pattern.strategies.SportsCarDriveStrategy;

public class SportsCar extends Vehicle {

	public SportsCar() {
		super(new SportsCarDriveStrategy());
		
	}

}
