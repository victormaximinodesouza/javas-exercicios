 package entities;

import java.util.Locale;
import java.util.Scanner;

import application.Buy;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Buy s;

		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt(); // Variavel temporaria
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n) ");
		char resp = sc.next().charAt(0);
		if (resp == 'y' || resp == 'Y' ) {
			System.out.print("Enter inital deposit value ");
			double initialDeposit = sc.nextDouble();
			s = new Buy(holder, number , initialDeposit); // se o usuario clicar em 'sim ' gerei uma sobrecarga com meus tres argumentos
		}else {
			s = new Buy(holder , number); // se o usario clicar em 'n' gerei uma sobrecarga com dois argumentos
			
			
		}
		
		
		
		
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(s);
		
		
		
		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double j = sc.nextDouble();
		s.deposit(j);
		System.out.println("Updated account data:");
		System.out.println(s);
		
		
		
	
		
		System.out.println();
		System.out.println("Enter a withdraw value:");
		j = sc.nextDouble();
		s.RemoveMoney(j);
		System.out.println("Updated account data:");
		System.out.println(s);
		
		
	
			
		
		sc.close();

	}

}
