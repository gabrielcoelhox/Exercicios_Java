/*
Uma empresa de consultoria deseja avaliar a performance de produtos,
funcion�rios, dentre outras coisas. Um dos c�lculos que ela precisa � encontrar
o maior dentre um conjunto de elementos. Fazer um programa que leia um
conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
mostre o mais caro deles. 
 */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import service.CalculationService;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");   // Formatar o produto
				list.add(new Product(fields[0], Double.parseDouble(fields[1]))); // Varre o arquivo e armazena todos os
				line = br.readLine();                                            // produtos na lista
			}
			
			Product x = CalculationService.max(list); // Calcular o maior produto da lista
			System.out.println("Most expensive:");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
