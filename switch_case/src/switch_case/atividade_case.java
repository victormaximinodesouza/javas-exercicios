package switch_case;

import java.util.Scanner;

public class atividade_case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String o;
		
		switch(x) {
			case 1:
				o ="Domingo";
				break;
			case 2:
				o ="Segunda";
				break;
			case 3: 
				o = "Terça";
				break;
			case 4:
				o = "Qaurta";
				break;
			case 5:
				o = "Quinta";
				break;
			case 6:
				o = "Sexta";
				break;
			case 7:
				o = "Sábado";
				break;
			default:
				o = "Dia errado";
				break;
		}
		
		System.out.println(o);
		sc.close();

}
}