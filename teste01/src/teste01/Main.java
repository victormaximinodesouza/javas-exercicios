package teste01;import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//double x = 10.34964;
		//System.out.println(x);
		//Locale.setDefault(Locale.US);
		//System.out.printf("%.4f%n" , x);
		//System.out.println("RESULTADO = " + x + " Metros");
		//System.out.printf("Resultado = %.2f metros%n" , x);
		
		//String nome = "Maria";
		//int idade = 31;
		//double renda = 4000.0;
		//System.out.printf("%s tem %d anos e ganha R$ %.1f reais%n" , nome, idade , renda);
		
		String produto1 = "Computador"; 
		String produto2 = "Mouse";
		
		int age = 30;
		int code = 5239;	
		
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 750.50;
		double price3 = 53.532322;
		
		//System.out.printf("%s com preço de R$ %.2f reais%n" , produto1 , price1);
		//System.out.printf("%s com preço de R$ %.2f reais%n" , produto1 , price2);
		System.out.printf("tem %d de idade , code %d e gender: %s%n" , age , code , gender);
		System.out.printf("Mouse com peso decimal : %.6f%n" , price3);
		System.out.printf("Preços também de : %.2f%n",  price3);
		System.out.printf("Us decimal pronto: %.8f%n" , price3);
	}

}
