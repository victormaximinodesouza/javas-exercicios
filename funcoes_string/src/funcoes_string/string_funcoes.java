package funcoes_string;

public class string_funcoes {

	public static void main(String[] args) {
		
		String original = "ood ososos popopoo";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		
		String s04 = original.substring(2);
		String s05 = original.substring(2 , 9);
		
		String s06 = original.replace('o', 'x');
		String s07 = original.replace("od", "xx");
		
		int x = original.indexOf("oso");
		int j = original.lastIndexOf("oso");
		
		
		System.out.println(s01);
		System.out.println(s02);
		System.out.println("-" + s03 + "-");
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(x);
		System.out.println(j);
		
		String s = "olá Pessoal tudo bem";
		String[] vect = s.split(" ");
		
		System.out.println(vect [0]);
		System.out.println(vect [1]);
		System.out.println(vect [2]);
		System.out.println(vect [3]);
		
	}

}
