package Projeto51;

import java.util.Scanner;

public class IdadeDias {
	public static void main(String args[])
	{
		int anos, meses, dias;
		int idadeEmDias;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a idade em anos: ");
		anos = leitor.nextInt();
		System.out.println("Digite a idade em meses: ");
		meses = leitor.nextInt();
		System.out.println("Digite a idade em dias: ");
		dias = leitor.nextInt();
		
		idadeEmDias = anos * 365 + meses * 30 + dias;
		
		System.out.println("\nIdade em dias: "+idadeEmDias);
		
		
	}


}
