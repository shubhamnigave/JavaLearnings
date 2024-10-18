package com.vehiclesystem.tester;

import com.vehiclesystem.core.Boat;
import com.vehiclesystem.core.Car;

public class VehicleTest {

	public static void main(String[] args) {
		Car c= new Car();
		c.start();
		c.drive();
		c.stop();
		Boat b = new Boat();
		b.start();
		b.sail();
		b.stop();
	}

}
