/**
 * 
 */
package estruturaCondicional;

import java.util.Scanner;

/**
 * @author Bruno Isobe 
 *         
 *         Fazer um programa para ler um n�mero inteiro e dizer se
 *         este n�mero � par ou �mpar.
 *
 */
public class Exer2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int inputNumber = scanner.nextInt();
		
		if (inputNumber % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("�MPAR");
		}

		scanner.close();
		
	}

}
