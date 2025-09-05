package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius");
		double radius = sc.nextDouble();
		
		Calculator calc = new Calculator();
		
		double c = calc.circu(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circu: %.2f%n", c );
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI: %.2f%n", calc.PI );
	}
	

}
