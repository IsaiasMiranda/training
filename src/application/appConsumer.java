package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProductConsumer;

public class appConsumer {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<ProductConsumer> list = new ArrayList<>();
		
		list.add(new ProductConsumer("TV", 900.00));
		list.add(new ProductConsumer("Mouse", 50.00));
		list.add(new ProductConsumer("Tablet", 350.50));
		list.add(new ProductConsumer("HD Case", 80.90));
		
		/*Consumer<ProductConsumer> cons = p -> {
			p.setPrice(p.getPrice() * 1.1);
		};*/
		
		//list.forEach(new UpdatePrice());
		
		//list.forEach(ProductConsumer::staticUpdatePrice);
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);
	}

}
