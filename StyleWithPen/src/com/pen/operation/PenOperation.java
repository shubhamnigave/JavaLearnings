package com.pen.operation;

import com.pen.core.Brand;
import com.pen.core.Material;
import com.pen.exception.Pen_Exception;

public interface PenOperation {
int addPen(Brand brand, String color, Material material, int quantity,
		int price)throws Pen_Exception;
}
