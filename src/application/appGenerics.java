package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProductGeneric;
import services.CalculationService;

public class appGenerics {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<ProductGeneric> list = new ArrayList<>();

		String path = "/home/isaias/Downloads/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new ProductGeneric(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			ProductGeneric x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.print(x);
		} catch (Exception e) {
			System.out.print("Error: " + e.getMessage());
		}
	}

}
