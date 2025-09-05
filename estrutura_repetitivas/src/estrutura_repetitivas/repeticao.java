package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class repeticao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		
//		double largura  = sc.nextDouble();
//		double comprimento = sc.nextDouble();
//		double metroQuadrado = sc.nextDouble();
//		
//		double area = largura * comprimento;
//		double preco = area * metroQuadrado;
//		
//		System.out.printf("AREA = %.2f%n" , area);
//		System.out.printf("PRECO = %.2f%n" , preco);
//
//	}
//
//}

//		int x = sc.nextInt();
//		int soma = 0;
//		
//		while ( x !=0) {
//			soma = soma + x;
//			x = sc.nextInt();
//			
//		}
//		System.out.println(soma);
//		
//		sc.close();
		
		
//		int x = 0;
//		int y = 4;
//		
//		while( x < 4) {
//			y = y + 2;
//			x = x + 1;
//			
//			System.out.println(x + "-" + y);
		
		
//		int N = sc.nextInt();
//		int soma = 0;
//		
//		for (int i=0; i<N; i++) {
//			int x = sc.nextInt();
//			soma = soma + x;
//		
//		}
//		
//		System.out.println(soma);
//		sc.close();
//		
//		
//
//		
//		
//		for (int i=4; i >=0; i --) {
//			System.out.println("Valor de i:" + i);
//		
//		}
//		
//		for (int i =5; i>0; i++) {
//			System.out.println("Valor de I:" + i);
//		}
		
		// 	Usando do-while
		
		char resp;
		
		do {
			System.out.println("Digite a temperatura em Celsius:");
			double C = sc.nextDouble();
			
			double f = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n" , f);
			System.out.println("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		
		
		sc.close();
		
		
}
}