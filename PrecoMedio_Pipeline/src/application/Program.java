/*
Fazer um programa para ler um conjunto de produtos a partir de um
arquivo em formato .csv (suponha que exista pelo menos um produto).

Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
nomes, em ordem decrescente, dos produtos que possuem preço
inferior ao preço médio.
*/

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();                  // Ler as linhas do arquivo
			while (line != null) {                        // Enquanto a linha for diferente de nulo, executar
				String[] fields = line.split(",");        // Recortando a String
				list.add(new Product (fields[0], Double.parseDouble(fields[1])));     // Files[0] = Nome, Filds[1] = Preço
				line = br.readLine();
			}
			double average = list.stream()
						.map(p -> p.getPrice())                        // Steam apenas com os preços dos produtos
						.reduce(0.0, (x,y) -> x + y) / list.size();    // Média do preço
			
			System.out.println("Average price: " + String.format("%.2f", average));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());  // Ordem alfabética
			List<String> names = list.stream()
						.filter(p -> p.getPrice() < average)
						.map(p -> p.getName())
						.sorted(comp.reversed())                                // Reverte o comparator
						.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		sc.close();
	}
}