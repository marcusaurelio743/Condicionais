package estruturaCondicional;

import java.util.Scanner;

public class Ex02 {
	/*Fazer um programa para ler um valor inteiro de 1 a 7 representando um 
dia da semana (sendo 1=domingo, 2=segunda, e assim por diante). 
Escrever na tela o dia da semana correspondente, conforme exemplos.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um dia:");
		int dia = sc.nextInt();
		
		if(dia == 1) {
			System.out.println("Domingo");
		}else if(dia ==2) {
			System.out.println("Segunda-feira");
		}else if(dia ==3) {
			System.out.println("Ter�a-feira");
		}else if(dia ==4) {
			System.out.println("Quarta-feira");
		}else if(dia ==5) {
			System.out.println("Quinta-feira");
		}else if(dia ==6) {
			System.out.println("Sexta-feira");
		}else if(dia ==7) {
			System.out.println("S�bado-feira");
		}else {
			System.out.println("Valor Invalido");
		}
		sc.close();

	}

}
