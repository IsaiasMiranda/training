package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class appAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);

		System.out.println("Enter account data");

		System.out.print("Number: ");
		int number = e.nextInt();
		e.nextLine();

		System.out.print("Holder: ");
		String holder = e.nextLine();

		System.out.print("Initial balance: ");
		double balance = e.nextDouble();

		System.out.print("Withdraw limit: ");
		double withdrawLimit = e.nextDouble();

		Account account = new Account(number, holder, balance, withdrawLimit);

		System.out.println();

		System.out.print("Enter amount for withdraw: ");
		double withdraw = e.nextDouble();

		try {
			account.withdraw(withdraw);
			System.out.printf("Novo saldo: %.2f%n", account.getBalance());
		} catch (BusinessException be) {
			System.out.println(be.getMessage());
		}

		e.close();
	}

}
