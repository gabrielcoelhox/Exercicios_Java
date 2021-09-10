/* Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// PARTE 1 - Inserindo dados da matriz
		
		System.out.print("Enter the number of rows of the matrix: ");
		int m = sc.nextInt();
		System.out.print("Enter the number of columns of the matrix: ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		System.out.println();
		System.out.println("Enter the matrix data:");
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// PARTE 2 - Número que pertence a matriz
		
		System.out.println();
		System.out.print("Enter a number that belongs to the matrix: ");
		int x = sc.nextInt();
		
		// PARTE 3 - Encontrar posições
		
		System.out.println();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("The number " + x + " is in the position " + i + "," + j + " of the matrix");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					} if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					} if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					} if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
						System.out.println();
					}	
				}
			}
		}
		sc.close();
	}

}
