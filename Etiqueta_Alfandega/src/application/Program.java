/*
Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). 
Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que 
foram digitados.
 
Todo produto possui nome e preço. Produtos importados possuem uma taxa de 
alfândega, e produtos usados possuem data de fabricação. Estes dados específicos
devem ser acrescentados na etiqueta de preço conforme exemplo (próxima página). 
Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final 
do produto.

*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int np = sc.nextInt();
		
		for(int i=1; i<=np; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
		}

	}

}
