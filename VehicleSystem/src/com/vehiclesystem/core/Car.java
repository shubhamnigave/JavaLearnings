package com.vehiclesystem.core;
import com.vehiclesystem.operations.LandVehicle;
public class Car implements LandVehicle {
	public void start() {
		System.out.println("Start");
	}
	public void drive() {
		System.out.println("Driving");
	}
	public void stop() {
		System.out.println("Stop");
	}
}
