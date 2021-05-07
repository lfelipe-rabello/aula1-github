package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Exercicio5 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank account;
		
		System.out.print("Enter account number:");
		int number = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println();
		System.out.print("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value:");
			double value = sc.nextDouble();
			account = new Bank(number, holder, value);
		}
		else {
			account = new Bank(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter deposit value:");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println(account);
		
		
		
		
		
		
		
		
		
	}

}
