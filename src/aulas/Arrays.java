package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = e.nextInt();
		double[] vector = new double[n];

		for (int i = 0; i < n; i++) {
			vector[i] = e.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			System.out.println("Índice: " + "[" + i + "] = " + vector[i]);
			sum += vector[i];
		}

		double average = sum / n;

		System.out.printf("The average is: %.2f%n", average);
		
		e.close();
	}

}
