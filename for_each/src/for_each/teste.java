package for_each;

public class teste {

	public static void main(String[] args) {
		String[] vect = new String[] {"Victor" , "Gustavo" , "JOsé"};
		
		for(int i =0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("----------------");
		for(String obj: vect) {
			System.out.println(obj);
		}
	}

}
