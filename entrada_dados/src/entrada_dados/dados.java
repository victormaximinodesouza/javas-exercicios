package entrada_dados;

import java.util.Scanner;

public class dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x; 
		x = sc.nextInt();
		System.out.println("Voce digitou " + x);
		
		String z;
		z = sc.next();
		System.out.println(z);
		
	
		
		double y;
		y = sc.nextDouble();
		System.out.println(y);
		
		sc.close();

		
		//char x;
		//x = sc.next() .charAt(5);
		//System.out.println("Voce digitou o " + x);
		//Locale.setDefault(Locale.US);
		
		
		//sc.close();
		
		//int y;
		//String x;
		//double z;
		//x = sc.next();
		//y = sc.nextInt();
		//z = sc.nextDouble();
		//System.out.println("Dados digitados:");
		//System.out.println(x);
		//System.out.println(y);
		//System.out.println(z);
		//System.out.printf("%s dados adicionados idade: %d peso: %f" , x , y , z);
		

	}

}

