package com.design.pattern.childClasses;

import com.design.pattern.parentClass.Vehicle;
import com.design.pattern.strategies.OffRoadCarDriveStrategy;

public class OffRoadCar extends Vehicle {

	public OffRoadCar() {
		super(new OffRoadCarDriveStrategy());
		
	}

}
