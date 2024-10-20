package com.mess.core;

public enum MessPlan {
	
	MONTHLY(3000,1L),
	QUARTERLY(11700,3L),
	HALFYEAR(17500,6L),
	YEARLY (32000,12L);
	private double final_amount;
	private long month;

	private MessPlan(double final_amount, long month) {
		this.final_amount = final_amount;
		this.month = month;
	}

	public double getFinal_amount() {
		return final_amount;
	}

	public long getMonth() {
		return month;
	}

	public void setMonth(long month) {
		this.month = month;
	}
	
}
