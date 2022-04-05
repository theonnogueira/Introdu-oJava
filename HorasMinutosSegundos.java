package Projeto51;

import java.util.Scanner;

public class HorasMinutosSegundos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double segundos,horas,minutos;
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("\nDigite uma quantidade de segundos: ");
		segundos = leitor.nextInt();
		
		horas = segundos / 3600;
		minutos = segundos / 60;
		
		System.out.println("\n horas: "+ horas + "\n minutos: " + minutos + "\n seguntos: "+ segundos);
		
		

	}

}
