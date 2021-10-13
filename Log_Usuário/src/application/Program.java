/*
Um site de internet registra um log de acessos dos usuários. Um registro de log 
consiste no nome de usuário (apenas uma palavra) e o instante em que o usuário 
acessou o site no padrão ISO 8601, separados por espaço, conforme exemplo. Fazer
um programa que leia o log de acessos a partir de um arquivo, e daí informe 
quantos usuários distintos acessaram o site.
*/

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");       // Caminho do arquivo
		String path = sc.nextLine();                      // Ler o caminho do arquivo

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {    // Abrir o arquivo com base no caminho path
																				// Bufferedreader para ler o arquivo
			Set<LogEntry> set = new HashSet<>();          // Para o exercício não importa a sequência, então usa hashset
														  // pq é mais rápido
			String line = br.readLine();                  // Ler as linhas do arquivo
			while (line != null) {                        // Enquanto a linha for diferente de nulo, executar
				
				String[] fields = line.split(" ");        // Recortando espaços vazios
				String username = fields[0];              // Instanciando username a partir do primeiro caractere
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntry(username, moment));
				
				line = br.readLine();	
			}
			System.out.println("Total users: " + set.size());  // Tamanho do conjunto, ou seja, quantidade de pessoas
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
