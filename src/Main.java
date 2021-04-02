import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double cat1,cat2,hip;
		System.out.println("digite o valor do cateto");
		cat1=teclado.nextDouble();
		cat1=Math.pow(cat1, 2.0);
		System.out.println("digite o valor do cateto oposto");
		cat2=teclado.nextDouble();
		cat2=Math.pow(cat2, 2.0);
		hip=(Math.pow(cat1, 2)+Math.pow(cat2,2));
	
		
		
		System.out.println(" o valor da hipotenusa é "+ Math.sqrt(hip));
		
		
		
		teclado.close();
		

	}

}
