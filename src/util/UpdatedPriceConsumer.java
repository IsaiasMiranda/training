package util;

import java.util.function.Consumer;

import entities.ProductConsumer;

public class UpdatePrice implements Consumer<ProductConsumer> {

	@Override
	public void accept(ProductConsumer p) {
		p.setPrice(p.getPrice() * 1.1);

	}

}