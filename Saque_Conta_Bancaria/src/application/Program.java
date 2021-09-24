/*
 Fazer um programa para ler os dados de uma conta banc�ria e depois realizar um
saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode ocorrer
ou se n�o houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. Implemente a conta banc�ria conforme projeto abaixo:
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PARTE 01 - Inser��o de dados
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double ib = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double wl = sc.nextDouble();
		
		Account acc = new Account(number, holder, ib, wl);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
	
		//PARTE 02 - Tratando com exception
		
		try {
			acc.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		} catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
