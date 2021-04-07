package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;

public class ProgramFour {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);

		Reservation[] reservation = new Reservation[11];

		// Quantos quartos serão alugados?
		System.out.print("How many rooms will be rented? ");
		int n = e.nextInt();

		for (int i = 1; i < n + 1; i++) {
			e.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String name = e.nextLine();
			System.out.print("Email: ");
			String email = e.nextLine();
			System.out.print("Room: ");
			int room = e.nextInt();
			reservation[room] = new Reservation(name, email, room);
		}

		System.out.println("Busy rooms: ");

		for (int i = 1; i < reservation.length; i++) {
			if (reservation[i] != null) {
				System.out.println(
						reservation[i].getRoom() + ": " + reservation[i].getName() + ", " + reservation[i].getEmail());
			}
		}

		e.close();
	}

}
