package entities;

public class ProductOne {
	private String name;
	private double price;
	private int quantity;

	public ProductOne() {
	}

	public ProductOne(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public ProductOne(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double TotalValueInStock() {
		return quantity * price;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return this.name + ", " + "$ " + String.format("%.2f", this.price) + ", " + this.quantity + " units, "
				+ "Total $: " + String.format("%.2f", TotalValueInStock());
	}
}
