/*
Em um portal de cursos online, cada usuário possui um código único, representado 
por um número inteiro.

Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor 
não é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode 
haver alunos repetidos em mais de um curso.

O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de 
alunos. Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, 
depois mostrar a quantidade total e alunos dele, conforme exemplo.
*/

package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Integer> A = new HashSet<>();           // Como não importa a sequência, utiliza HashSet por ser mais rápido
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int nA = sc.nextInt();                                   // Quantidades de alunos no curso A
		for (int i = 0; i< nA; i++) {                            // Repete a quantidade baseado no nA
			System.out.print("Código do aluno: ");
			int number = sc.nextInt();                           // Código do aluno
			A.add(number);                                       // Guardar os valores na variável A                
		}
		
		System.out.print("How many students for course B? ");
		int nB = sc.nextInt();                                   
		for (int i = 0; i< nB; i++) {  
			System.out.print("Código do aluno: ");
			int number = sc.nextInt();                           
			B.add(number);                                                       
		}
		
		System.out.print("How many students for course C? ");
		int nC = sc.nextInt();                                   
		for (int i = 0; i< nC; i++) { 
			System.out.print("Código do aluno: ");
			int number = sc.nextInt();                           
			C.add(number);                                                       
		}
		
		Set<Integer> total = new HashSet<>(A);
		total.addAll(B);
		total.addAll(C);
		
		System.out.println("Total students: " + total.size());

		sc.close();
	}

}
