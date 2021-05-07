package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		
		Rooms [] vect = new Rooms[10];
		for (int i = 1; i<=n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d%n", i);
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Room:");
			int room = sc.nextInt();
			System.out.println();
			
			vect [room] = new Rooms(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
	}

}
