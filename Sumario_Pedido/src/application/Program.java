/*Ler os dados de um pedido com N itens (N fornecido pelo usu�rio). Depois, mostrar um
sum�rio do pedido conforme exemplo (pr�xima p�gina). Nota: o instante do pedido deve ser
o instante do sistema: new Date()*/

package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.OrderItem;
import entities.Client;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Product prod = new Product(null, null);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		sc.close();
	}

}
