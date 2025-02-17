package oops;

public class Car_Constructor {
	private String brand;
	private double price;

	public Car_Constructor() {
		this.brand ="Unknown";
		this.price = 0.00;
	}
	public Car_Constructor(String brand, double price) {
		this.brand=brand;
		this.price=price;
	}
	public String getCar_Constructor_brand() {
		return brand;
	}
	public void setCar_Constructor_brand(String brand) {
		this.brand = brand;
	}
	public double getCar_Constructor_price() {
		return price;
	}
	public void set_Car_Constructor_price(double price) {
		this.price = price;
	}
	public void display_Details() {
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
	}
	
}
