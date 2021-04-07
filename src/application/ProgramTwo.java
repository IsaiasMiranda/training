package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramTwo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner e = new Scanner(System.in);

		Account account;

		System.out.print("Enter account number: ");
		int accountNumber = e.nextInt();
		e.nextLine();

		System.out.print("Enter account holder: ");
		String holder = e.nextLine();

		System.out.print("is there na initial deposit (Y | N)? ");
		char response = e.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter the deposit amount : $ ");
			account = new Account(accountNumber, holder, e.nextDouble());
		} else {
			account = new Account(accountNumber, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: $ ");
		account.deposit(e.nextDouble());

		System.out.println();		
		System.out.println("Updated account data");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: $ ");
		account.withdraw(e.nextDouble());

		System.out.println();
		System.out.println("Updated account data");
		System.out.println(account);

		e.close();
	}

}
