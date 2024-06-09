package estruturaCondicional;
/*Uma operadora de telefonia cobra R$ 50.00 por um plano b�sico que
d� direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu, da� mostrar o valor
a ser pago*/

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantos minutos durou sua liga��o?");
		
		int minuto = sc.nextInt();
		double conta = 50.00;
		
		if(minuto >100) {
			conta +=(minuto-100) * 2.0;
		}
		
		System.out.printf("Valor da conta foi de %.2f",conta);
		
		sc.close();
	}

}
