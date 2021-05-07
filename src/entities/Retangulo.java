package entities;

public class Retangulo {
	
	public double a;
	public double b;
	
	public double area() {
		return a * b;
	}
	public double perimeter() {
		return (a*2)+(b*2);
	}
	public double diagonal() {
		return Math.sqrt((a*a)+(b*b));
	}
	
	
	public String toString() {
		return "Area =  "
			+ String.format("%.2f", area())
			+ String.format("%n")
			+"Perimeter = "
			+ String.format("%.2f", perimeter())
			+ String.format("%n")	
			+"Diagonal = "
			+ String.format("%.2f", diagonal());
	}
	
}
	
	

