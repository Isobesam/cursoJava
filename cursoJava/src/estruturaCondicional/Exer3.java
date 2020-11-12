/**
 * 
 */
package estruturaCondicional;

import java.util.Scanner;

/**
 * @author Bruno Isobe 
 *         
 *         Leia 2 valores inteiros (A e B). Após, o programa deve
 *         mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
 *         indicando se os valores lidos são múltiplos entre si. Atenção: os
 *         números devem poder ser digitados em ordem crescente ou decrescente.
 *
 */
public class Exer3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int inputNumber1 = scanner.nextInt();
		int inputNumber2 = scanner.nextInt();
		
		if (inputNumber1 % inputNumber2 == 0 || inputNumber2 % inputNumber1 == 0) {
			System.out.println("Sao Multiplos!");
		} else {
			System.out.println("Nao sao Multiplos!");
		}

		scanner.close();

	}

}
