/*
Um site de internet registra um log de acessos dos usu�rios. Um registro de log 
consiste no nome de usu�rio (apenas uma palavra) e o instante em que o usu�rio 
acessou o site no padr�o ISO 8601, separados por espa�o, conforme exemplo. Fazer
um programa que leia o log de acessos a partir de um arquivo, e da� informe 
quantos usu�rios distintos acessaram o site.
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
			Set<LogEntry> set = new HashSet<>();          // Para o exerc�cio n�o importa a sequ�ncia, ent�o usa hashset
														  // pq � mais r�pido
			String line = br.readLine();                  // Ler as linhas do arquivo
			while (line != null) {                        // Enquanto a linha for diferente de nulo, executar
				
				String[] fields = line.split(" ");        // Recortando espa�os vazios
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
