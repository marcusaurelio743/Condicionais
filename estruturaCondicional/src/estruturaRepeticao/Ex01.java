package estruturaRepeticao;

import java.util.Scanner;

/*Fazer um programa que l� n�meros
inteiros at� que um zero seja lido. Ao
final mostra a soma dos n�meros lidos.*/

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor");
		int valor = sc.nextInt();
		int soma = 0;
		while( valor != 0) {
			if(valor != 0) {
				
				System.out.println("Informe um valor");
				 valor = sc.nextInt();
				 soma+=valor;
				
			}else {
				break;
			}
		}
		System.out.println("valor da soma dos valores digitados �: "+soma);
		
		sc.close();
		

	}

}
