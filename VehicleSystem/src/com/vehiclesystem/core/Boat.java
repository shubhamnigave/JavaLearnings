package com.vehiclesystem.core;
import com.vehiclesystem.operations.WaterVehicle;
public class Boat implements WaterVehicle{
	public void start() {
		System.out.println("Start");
	}
	public void sail() {
		System.out.println("Sailing");
	}
	public void stop() {
		System.out.println("Stop");
	}//go
}
