package com.design.pattern;

import com.design.pattern.childClasses.SportsCar;
import com.design.pattern.parentClass.Vehicle;

public class Main {

	public static void main(String[] args) {

         System.out.println("Hello");
         
         Vehicle obj = new SportsCar();
         obj.drive();
         
      
         
	}

}
