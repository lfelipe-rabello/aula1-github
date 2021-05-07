package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Notas nota = new Notas();
		
		System.out.print("Name:");
		nota.name = sc.nextLine();
		System.out.println("Enter to notes:");
		nota.noteA = sc.nextDouble();
		nota.noteB = sc.nextDouble();
		nota.noteC = sc.nextDouble();
		
		double totalNotas = nota.totalNote();
		System.out.printf("FINAL GRADE: %.2f%n", totalNotas);
		if (totalNotas>=60) {
			System.out.println("PASS");
		}
		else {
			double failed = nota.failedNote();
			System.out.printf("FAILED%nMISSING %.2f POINTS", failed);
		}
	}

}
