package entities;

public class CurrencyConvert {
	
	public static double dollar = 3.14;
	public static final double iof = 0.06;
	
	public static double convertToReal(int quantity) {
		return dollar * quantity;
	}
}
