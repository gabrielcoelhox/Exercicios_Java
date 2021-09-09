/*

Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:

Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)

• Realizar uma entrada no estoque e mostrar novamente os dados do produto.
• Realizar uma saída no estoque e mostrar novamente os dados do produto.
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.printf("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity); // Construtor
		
		product.setName("biromrom");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(2000.00);
		System.out.println("Updated price: "+ product.getPrice());
		
		System.out.println();
		System.out.printf("Product data: " + product);
		
		System.out.println();
		System.out.printf("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.printf("Updated data: " + product);
		
		System.out.println();
		System.out.printf("Enter the number of product to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.printf("Updated data: " + product);
		
		
		sc.close();
	}

}
