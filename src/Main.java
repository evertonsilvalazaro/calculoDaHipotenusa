import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double cat1,catoposto,hip;
		System.out.println("digite o valor do cateto");
		cat1=teclado.nextDouble();
		cat1=Math.pow(cat1, 2.0);
		System.out.println("digite o valor do cateto oposto");
		catoposto=teclado.nextDouble();
		hip=Math.sqrt(Math.pow(cat1,2)+ Math.pow(catoposto, 2));
		
		
		System.out.println(" o valor da hipotenusa é "+ hip);
		
		
		
		teclado.close();
		

	}

}
