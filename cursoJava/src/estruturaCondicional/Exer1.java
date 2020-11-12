package estruturaCondicional;

/**
 * @author Bruno Isobe 
 * 
 *		   Fazer um programa para ler um n�mero inteiro, e depois dizer se 
 *		   este n�mero � negativo ou n�o. 	
 */

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numeroDeEntrada = scanner.nextInt();

		if (numeroDeEntrada < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("N�O NEGATIVO");
		}

		scanner.close();
	}

}
