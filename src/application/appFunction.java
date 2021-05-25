package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.ProductFunction;

public class appFunction {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<ProductFunction> list = new ArrayList<>();

		list.add(new ProductFunction("TV", 900.00));
		list.add(new ProductFunction("Mouse", 50.00));
		list.add(new ProductFunction("Tablet", 350.50));
		list.add(new ProductFunction("HD Case", 80.90));

		// List<String> newList = list.stream().map(new

		// UpperCaseFunction()).collect(Collectors.toList());

		//List<String> newList = list.stream().map(ProductFunction::staticUpperCaseName).collect(Collectors.toList());

		List<String> newList = list.stream().map(ProductFunction::NonStaticUpperCaseName).collect(Collectors.toList());
		
		newList.forEach(System.out::println);
	}

}
