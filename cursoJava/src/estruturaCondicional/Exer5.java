/**
 * 
 */
package estruturaCondicional;

import java.util.Scanner;

/**
 * @author Bruno Isobe 
 * 
 *         Com base na tabela abaixo, escreva um programa que leia o
 *         código de um item e a quantidade deste item. A seguir, calcule e
 *         mostre o valor da conta a pagar.
 *
 */
public class Exer5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int numberOfOrder = scanner.nextInt();
		int amountOfOrder = scanner.nextInt();
		
		double totalOfOrder;
		
		if (numberOfOrder == 1) {
			totalOfOrder = amountOfOrder * 4;
		}else if (numberOfOrder == 2) {
			totalOfOrder = amountOfOrder * 4.5;
		}else if (numberOfOrder == 3) {
			totalOfOrder = amountOfOrder * 5;
		}else if (numberOfOrder == 4) {
			totalOfOrder = amountOfOrder * 2;
		}else {
			totalOfOrder = amountOfOrder * 1.5;
		}
		
		System.out.printf("Total: %.2f", totalOfOrder);
		
		scanner.close();
	}

}
