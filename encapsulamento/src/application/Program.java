package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Javas;

public class Program {
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			 //Product - nome da classe, product - nome da variavel, new Product() cria uma instancia 
			System.out.println("Enter product data:");
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			Javas product = new Javas(name, price);
			
			product.setName("Computer");
			System.out.println("Update name" + product.getName());
			product.setPrice(1200.0);
			System.out.println("Update price: " + product.getPrice());
			
			
			
			
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


