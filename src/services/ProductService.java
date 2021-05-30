package services;

import java.util.List;
import java.util.function.Predicate;

import entities.ProductFilter;

public class ProductService {

	public Double FilterByProduct(List<ProductFilter> list, Predicate<ProductFilter> criteria) {
		double sum = 0.0;
		for (ProductFilter p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
