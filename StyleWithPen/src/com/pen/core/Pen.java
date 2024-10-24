package com.pen.core;

import java.time.LocalDate;

public class Pen {
	
	private int ID;
	private  Brand Brand;
	private String Color;
	private Material material;
    private int quantity;
	private LocalDate UpdateDate;
	private LocalDate ListingDate;
	private int Price;
	private int Discount;
	public Pen(int iD,Brand brand, String color, Material material, int quantity, LocalDate updateDate,
			LocalDate listingDate, int price, int discount) {
		super();
		ID = iD;
		Brand = brand;
		Color = color;
		this.material = material;
		this.quantity = quantity;
		UpdateDate = updateDate;
		ListingDate = listingDate;
		Price = price;
		Discount = discount;
	}
	@Override
	public String toString() {
		return "Pen [ID=" + ID + ", Brand=" + Brand + ", Color=" + Color + ", material=" + material + ", quantity="
				+ quantity + ", UpdateDate=" + UpdateDate + ", ListingDate=" + ListingDate + ", Price=" + Price
				+ ", Discount=" + Discount + "]";
	}
	public int getID() {
		return ID;
	}
	public Brand getBrand() {
		return Brand;
	}
	public String getColor() {
		return Color;
	}
	public Material getMaterial() {
		return material;
	}
	public int getQuantity() {
		return quantity;
	}
	public LocalDate getUpdateDate() {
		return UpdateDate;
	}
	public LocalDate getListingDate() {
		return ListingDate;
	}
	public int getPrice() {
		return Price;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setBrand(Brand brand) {
		Brand = brand;
	}
	public void setColor(String color) {
		Color = color;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setUpdateDate(LocalDate updateDate) {
		UpdateDate = updateDate;
	}
	public void setListingDate(LocalDate listingDate) {
		ListingDate = listingDate;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}

	
}
