package com.pen.validation;

import java.time.LocalDate;

import com.pen.core.Brand;
import com.pen.core.Material;
import com.pen.exception.Pen_Exception;

public class PenValidation {
	public static LocalDate parseAndUpdateDate(LocalDate updateDate2) {
		
		return null;
}
	public static void addPen(Brand brand, String color, Material material, int quantity, int price) throws Pen_Exception {
	    // Validate input
	    if (quantity <= 0) {
	        throw new Pen_Exception("Quantity must be greater than 0.");
	    }
	    if (price <= 0) {
	        throw new Pen_Exception("Price must be greater than 0.");
	    }	
}
	}
