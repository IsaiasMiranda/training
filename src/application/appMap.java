package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.ProductMap;

public class appMap {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Map<ProductMap, Double> stock = new HashMap<>();

		ProductMap p1 = new ProductMap("Tv", 900.00);
		ProductMap p2 = new ProductMap("Notebook", 1200.00);
		ProductMap p3 = new ProductMap("Tablet", 400.00);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);

		ProductMap ps = new ProductMap("Tv", 900.00);

		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

		sc.close();
	}

}
