package sintaxe_opcional;

import java.util.Locale;
import java.util.Scanner;

public class cumulativa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int minutos = sc.nextInt();	
		
		double conta =  50.0;
		if (minutos > 100) {
			conta =+ (minutos - 100)  * 2.0;
		}
		
		System.out.printf("valor da conta = R$%.2f%n" , conta);
		
		//conta = conta + (minutos - 100)  * 2.0; - excidente
		
		sc.close();
	}

}
