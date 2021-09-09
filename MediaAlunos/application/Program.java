/*
Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para
resolver este problema.
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Nome do aluno: ");
		student.nome = sc.nextLine();
		System.out.print("Primeira Nota: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Segunda Nota: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Terceira Nota: ");
		student.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Nota final: %.2f%n", student.total());
		
		if (student.total() < 60.00) {
			System.out.println("N�O PASSOU");
			System.out.printf("Faltam: %.2f Pontos%n", student.pontosFaltam());
		} else {
			System.out.println("PASSOU");
		}
		
		
		sc.close();
	}

}
