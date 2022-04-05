package Projeto51;

import java.util.Scanner;

public class tresNumerosInteiros {

	public static void main(String[] args) {
	
		int a,b,c,d,r,s;
		Scanner leitor = new Scanner (System.in);
		System.out.println("\n Entre com o primeiro número: ");
		a = leitor.nextInt();
		
	
		System.out.println("\n Entre com o segundo número: ");
		b = leitor.nextInt();
		System.out.println("\n Entre com o terceiro número: ");
		c = leitor.nextInt();
		
		r = (a + b) * 2;
		s = (b + c) * 2;
		d = (r + s) / 2;
		
		System.out.println("\n O valor de R: "+r);
		System.out.println("\n O valor de S: "+s);
		System.out.println("\n O valor de D: "+d);

		
		
		
	}

}
