	package ativiade_2;
	
	import java.util.Locale;
	import java.util.Scanner;
	
	import entities.Fuc;
	
	public class Cod {
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Fuc o = new Fuc();
			
			System.out.print("Name:");
			o.name = sc.nextLine();
			System.out.print("Gross Salary:");
			o.Salary = sc.nextDouble();
			System.out.print("Tax: ");
			o.tax = sc.nextDouble();
			 
			o.condicaoSalary();
			
			System.out.println();
			System.out.printf("Employee: %s ,  $%.3f%n " , o.name , o.netSalary());
			
			System.out.println();
			System.out.println("Aplicando a porcentagem do meu valor");
			double porce = sc.nextDouble();
			o.PorcentagemSalary(porce);
			
			System.out.println();
			System.out.println("Update data:" + o);
			sc.close();	
			
			sc.close();
	
		}
		
	}
