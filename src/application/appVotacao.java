package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class appVotacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<String, Integer> votes = new HashMap<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String candidate = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (votes.containsKey(candidate)) {
					int countVotes = votes.get(candidate);
					votes.put(candidate, count + countVotes);
				} else {
					votes.put(candidate, count);
				}

				line = br.readLine();
			}

			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		for (String string : args) {

		}
		sc.close();
	}

}
