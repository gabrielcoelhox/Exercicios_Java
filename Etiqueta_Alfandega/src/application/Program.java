/*
Fazer um programa para ler os dados de N produtos (N fornecido pelo usu�rio). 
Ao final, mostrar a etiqueta de pre�o de cada produto na mesma ordem em que 
foram digitados.
 
Todo produto possui nome e pre�o. Produtos importados possuem uma taxa de 
alf�ndega, e produtos usados possuem data de fabrica��o. Estes dados espec�ficos
devem ser acrescentados na etiqueta de pre�o conforme exemplo (pr�xima p�gina). 
Para produtos importados, a taxa e alf�ndega deve ser acrescentada ao pre�o final 
do produto.

*/

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int np = sc.nextInt();
		
		for(int i=1; i<=np; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (type == 'c' || type == 'C') {
				list.add(new Product(name, price));
			} else if (type == 'u' || type == 'U'){
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			} else {
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, fee));
			}
		}
		
		System.out.println();
		System.out.println("* PRICE TAGS *");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}
