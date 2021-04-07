package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductTwo;

public class ProgramThree {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = e.nextInt();

		ProductTwo[] vect = new ProductTwo[n];

		for (int i = 0; i < vect.length; i++) {
			e.nextLine();
			String name = e.nextLine();
			double price = e.nextDouble();
			vect[i] = new ProductTwo(name, price);
		}

		double sum = 0.00;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double average = sum / vect.length;
		
		System.out.printf("The average is: %.2f%n", average);
		
		for (ProductTwo productTwo : vect) {
			System.out.print("Name: " + productTwo.getName() + " - ");
			System.out.printf("Price $ %.2f%n ", productTwo.getPrice());
		}

		e.close();
	}

}
