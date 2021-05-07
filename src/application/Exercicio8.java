package application;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] mat = new int[l][c];
		
		for(int i=0; i<l; i++) {
			for (int j=0; j<c;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
			
		
		int nul = -1;
		
		
		int number = sc.nextInt();
		for(int i=0; i<l; i++) {
			for (int j=0; j<c;j++) {
				if(mat[i][j] == number) {
					System.out.println("Positian:"+ i + ", "+ j );	
					
					if(j > 0 ) {
						int left = mat[i][j-1];
						System.out.println("Left: "+ left);
					}
					if(j < c-1 ) {
						int right = mat[i][j+1];
						System.out.println("Right: "+ right);
					}
					if (i > 0 ) {
						int up = mat[i-1][j];
						System.out.println("Up: "+ up);
					}
					if (i< l-1) {
						int down = mat[i+1][j];
						System.out.println("Down: "+ down);
					}
				}	
			}
		}
	}
}