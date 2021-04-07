package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConvert;

public class ProgramOne {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner e = new Scanner(System.in);

		// cotação dollar 3.14
		System.out.println("What is the dollar  price? Dollar 3.14");

		System.out.print("how many dollars will be bougth ?");
		double valueDollar = CurrencyConvert.convertToReal(e.nextInt());

		double amountPayableInReais = valueDollar + (valueDollar * CurrencyConvert.iof);

		System.out.printf("Amount to be paid in reais ? R$: %.2f%n ", amountPayableInReais);
	}

}
