/*
Fazer um programa para ler os dados (nome, email e salário)
de funcionários a partir de um arquivo em formato .csv.

Em seguida mostrar, em ordem alfabética, o email dos
funcionários cujo salário seja superior a um dado valor
fornecido pelo usuário.

Mostrar também a soma dos salários dos funcionários cujo
nome começa com a letra 'M'. 
 */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();                  // Ler as linhas do arquivo
			while (line != null) {                        // Enquanto a linha for diferente de nulo, executar
				String[] fields = line.split(",");        // Recortando a String
				list.add(new Employee (fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.println("Enter Salary: ");
			double salary = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(p -> p.getSalary() > salary)  // Filtrar o salário pelo maior
					.map(p -> p.getName())
					.sorted()                             // Ordenar com ordem crescente
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
			emails.forEach(System.out::println);
			
			double soma = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')     // Filtrar os nomes que iniciam pela letra M
					.map(x -> x.getSalary())                        // Steam apenas com os preços dos produtos
					.reduce(0.0, (x,y) -> x + y);                  // Média
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", soma));
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
