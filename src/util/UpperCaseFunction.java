package util;

import java.util.function.Function;

import entities.ProductFunction;

public class UpperCaseFunction implements Function<ProductFunction, String>{

	@Override
	public String apply(ProductFunction p) {
		return p.getName().toUpperCase();
	}

}
