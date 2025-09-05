package entities;

import java.util.Locale;
import java.util.Scanner;

import OPP.JavaOOP;

public class Java {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			
			JavaOOP o = new JavaOOP();
			System.out.println("Enter rectangle width and height");
			
			
		
			o.height = sc.nextDouble();
			o.width = sc.nextDouble();
			
			System.out.println("Area" + o.Area());
			System.out.println("Perimeter" + o.Perimeter());
			System.out.println("Diagonal " + o.Diagonal());
			
			
			
			sc.close();
			
			

	}

}
