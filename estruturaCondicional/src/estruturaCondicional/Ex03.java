package estruturaCondicional;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor");
		int valor = sc.nextInt();
		String resultado = (valor%2==0)?"par": "impar";
		
		System.out.println(resultado);
		
		sc.close();

	}

}
