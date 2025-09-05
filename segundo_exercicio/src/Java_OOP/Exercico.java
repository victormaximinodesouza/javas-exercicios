package Java_OOP;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercico {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Product product = new Product(); //Product - nome da classe, product - nome da variavel, new Product() cria uma instancia 
			System.out.println("Enter product data:");
			System.out.println("Name: ");
			product.name = sc.nextLine();
			System.out.print("Price: ");
			product.price = sc.nextDouble();
			System.out.print("Quantity in stock : ");
			product.quantity = sc.nextInt();
			
			
			System.out.println();
			System.out.println("Product data: " + product);
			
			System.out.println();
			System.out.println("Enter the number of products to be added in stock");
			int quantity = sc.nextInt();
			product.addProducts(quantity);
			
			System.out.println();
			System.out.println("Update data: " + product);
			
			System.out.println();
			System.out.println("Enter the number of products to be removed from stock");
			quantity = sc.nextInt();
			product.removeProducts(quantity);
			
			
			System.out.println();
			System.out.println("Update data : " + product);
			
			
			
			sc.close();
		}

	} 



