package entities;

import java.util.Locale;
import java.util.Scanner;

import Java.Over;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Over s = new Over();
		
		s.nome = sc.nextLine();
		s.nota1 = sc.nextDouble();
		s.nota2 = sc.nextDouble();
		s.nota3 = sc.nextDouble();
		
		
		if (s.SomadeNotas() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n" , s.SomadeNotas());
		}else {
			System.out.println("PASS");
			
		}
		
		sc.close();

	}

}
