package estaticos;

import java.util.Locale;
import java.util.Scanner;

import application.CurrencyConverter;

public class estaticos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter s = new CurrencyConverter();
		
		
		
		System.out.print("What is the dollar price?");
		s.moeda = sc.nextDouble();
		

		
		System.out.print("Quanto dólar você quer comprar??");
		s.real = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Você quer comprar " + s.real + " "
				+ ", a quantidade a ser pago vai ser " + s.SomaMoedas());
		System.out.println("Total a pagar vai ser = " + s.SomaMoedas());
		
		//System.out.println("Você comprou " + s.real + "a quantidade a ser pago vai ser");
		
		
		
		
		
		
		
		
		
	
		
		sc.close();
		
		

	}

}
