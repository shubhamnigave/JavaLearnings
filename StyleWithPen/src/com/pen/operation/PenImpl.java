package com.pen.operation;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.pen.core.Brand;
import com.pen.core.Material;
import com.pen.core.Pen;
import com.pen.exception.Pen_Exception;

public class PenImpl implements PenOperation {
	private Map<Integer, Pen> Pen;
	private static int idCounter = 0;
	public int id;

	public PenImpl() {
		Pen = new HashMap<>();
		int id = ++idCounter;
		Pen.put(id, new Pen(id, Brand.PARKER, "Black", Material.ALLOYSTEEL, 30, LocalDate.parse("2022-08-09"),
				LocalDate.parse("2022-09-09"), 700, 10));
		id = ++idCounter;
		Pen.put(id, new Pen(id, Brand.CELLO, "Blue", Material.PLASTIC, 20, LocalDate.parse("2022-09-10"),
				LocalDate.parse("2022-10-09"), 200, 20));
		id = ++idCounter;
		Pen.put(id, new Pen(id, Brand.REYNOLDS, "Red", Material.METAL, 40, LocalDate.parse("2022-08-09"),
				LocalDate.parse("2022-09-09"), 300, 15));
		id = ++idCounter;
	}

	@Override
	public int addPen(Brand brand, String color, Material material, int quantity, int price) throws Pen_Exception {
		Pen.put(new addPen(brand, color, material, quantity, price));
		return "Pen Added Succefully";
	}

}
