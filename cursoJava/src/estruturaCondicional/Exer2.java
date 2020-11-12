/**
 * 
 */
package estruturaCondicional;

import java.util.Scanner;

/**
 * @author Bruno Isobe 
 *         
 *         Fazer um programa para ler um número inteiro e dizer se
 *         este número é par ou ímpar.
 *
 */
public class Exer2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int inputNumber = scanner.nextInt();
		
		if (inputNumber % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		scanner.close();
		
	}

}
