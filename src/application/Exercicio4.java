package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		CurrencyConverter.price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		CurrencyConverter.dollars = sc.nextDouble();
		
		double total = CurrencyConverter.pay();
		
		System.out.printf("Amount to be paid in reais = %.2f", total);
		

	}

}
