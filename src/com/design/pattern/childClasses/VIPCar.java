package com.design.pattern.childClasses;

import com.design.pattern.parentClass.Vehicle;
import com.design.pattern.strategies.VIPCarDriveStrategy;

public class VIPCar extends Vehicle{

	public VIPCar() {
		super(new VIPCarDriveStrategy());
	
	}

}
