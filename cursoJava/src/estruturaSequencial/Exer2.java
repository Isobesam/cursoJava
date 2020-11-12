package estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;
/*
 * @author Bruno Isobe
 * 
 *         Faça um programa para ler o valor do raio de um círculo, e depois
 *         mostrar o valor da área deste círculo com quatro casas decimais
 *         conforme exemplos. Fórmula da área: area = π . raio^2. Considere o
 *         valor de π = 3.14159.
 */
public class Exer2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		raio = sc.nextDouble();
		float area = (float) (Math.PI * Math.pow(raio, 2));
		
		System.out.printf("A: %.4f", area);
		
		sc.close();
	}

}
