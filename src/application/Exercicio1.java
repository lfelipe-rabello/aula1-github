package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.a = sc.nextDouble();
		retangulo.b = sc.nextDouble();
		
		double areaX = retangulo.area();
		double perimeterX = retangulo.perimeter();
		double diagonalX = retangulo.diagonal();
		
		System.out.println(retangulo);
	
		
	}
		
}
