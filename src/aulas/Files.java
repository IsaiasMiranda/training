package aulas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProductFiles;

public class Files {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		File file = new File("//home//isaias//Downloads//product.txt");
		File directory = new File("//home//isaias//Downloads//out");
		String summaryCsv = "//home//isaias//Downloads//out//summary.csv";
		Scanner sc = null;

		List<ProductFiles> listProduct = new ArrayList<ProductFiles>();

		if (!directory.exists()) {
			directory.mkdir();
		}

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();

			line = br.readLine();
			while (line != null) {
				System.out.println(line);

				String[] product = line.split(";");
				String name = product[0];
				Double price = Double.parseDouble(product[1]);
				Integer quantity = Integer.parseInt(product[2]);

				ProductFiles p = new ProductFiles(name, price, quantity);

				listProduct.add(p);

				line = br.readLine();

			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(summaryCsv))) {
				bw.write("Product , Total");
				bw.newLine();
				for (ProductFiles listSummary : listProduct) {
					bw.write(listSummary.getName() + " , ");
					bw.write(String.valueOf(listSummary.updateValue()));
					bw.newLine();

				}

			} catch (IOException e) {
				throw new IOException("Error reading file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
