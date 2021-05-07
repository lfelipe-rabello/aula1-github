package entities;

public class Notas {
	public String name;
	public double noteA;
	public double noteB;
	public double noteC;
	
	public double totalNote() {
		return noteA + noteB + noteC;
	}
	public double failedNote() {
		return 60 - totalNote();
	}



}


