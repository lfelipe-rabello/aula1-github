package entities;

public class CurrencyConverter {
	public static double price;
	public static double dollars;
	
	
	public static double pay() {
		return (price * dollars * 6/100 )+ price * dollars;
	}
	
	
	
}
