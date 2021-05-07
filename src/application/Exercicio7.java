package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employ;

public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Employ> list = new ArrayList<>();
		
		
		System.out.print("How many employees will be registered:");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Employee #"+i);
			System.out.println();
			System.out.print("Id:");
			Integer id = sc.nextInt();
			
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary:");
			Double salary = sc.nextDouble();	
			
			Employ employ = new Employ(id, name, salary);
			list.add(employ);
		}
		System.out.print("Enter the employee id that will have salary increase:");
		Integer idConsulter = sc.nextInt();
		
		Employ emp = list.stream().filter(x -> x.getId() == idConsulter).findFirst().orElse(null);
		
		//Integer pos = position(list, idConsulter);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentege:");
			double per = sc.nextDouble();
			emp.addSalary(per);
		}
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employ employ : list ) {
			System.out.println(employ);
		}
		
		
		
	
		
		}
		public static Integer position(List<Employ> list, Integer id) {
			for (int i = 0; i<list.size();i++) {
				if (list.get(i).getId()== id) {
					return i;
				}
			}
			return null;
		}
		
		
		
	}


