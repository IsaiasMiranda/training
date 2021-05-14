package application;

import java.util.ArrayList;
import java.util.List;

import entities.ProductComparator;

public class appComparator {

	public static void main(String[] args) {
		
		List<ProductComparator> list = new ArrayList<>();
		
		list.add(new ProductComparator("Tv",900.0));
		list.add(new ProductComparator("Notebook",1200.0));
		list.add(new ProductComparator("Tablet",800.0));
		
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (ProductComparator p : list) {
			System.out.println(p);
		}
	}

}
