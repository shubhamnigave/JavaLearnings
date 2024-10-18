package com.student.core;

public enum Course {
	DAC(95000),
	DBDA(90000),
	DITTIS(85000);
	private double fees;
	Course (double fees){
		this.fees=fees;
	}
	public double getFees() {
		return fees;
	}
}
