package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProductFilter;
import services.ProductService;

public class appProductService {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<ProductFilter> list = new ArrayList<>();

		list.add(new ProductFilter("TV", 900.00));
		list.add(new ProductFilter("Mouse", 50.00));
		list.add(new ProductFilter("Tablet", 350.50));
		list.add(new ProductFilter("HD Case", 80.90));

		ProductService ps = new ProductService();

		System.out.print("Search by letter: ");
		// char search = sc.next().toUpperCase().charAt(0);

		// double sum = ps.FilterByProduct(list, p -> p.getName().charAt(0) == search);
		double sum = ps.FilterByProduct(list, p -> p.getPrice() < 100);

		System.out.println("Sum = " + String.format("%.2f", sum));

		sc.close();
	}

}
