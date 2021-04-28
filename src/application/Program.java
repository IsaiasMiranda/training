package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductOne;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner e = new Scanner(System.in);

		System.out.print("Product's name: ");
		String name = e.nextLine();
		System.out.print("Price R$: ");
		double price = e.nextDouble();
		System.out.print("quantity in stock: ");
		int quantity = e.nextInt();

		ProductOne product = new ProductOne(name, price, quantity);
		
		System.out.println("Product data: " + product);

		System.out.print("Enter the number of products to be added in stock:");
		product.addProducts(e.nextInt());

		System.out.println("Updated data: " + product);

		System.out.print("Enter the number of products to be removed in stock:");
		product.removeProduct(e.nextInt());

		System.out.println("Updated data: " + product);

		e.close();
	}

}
