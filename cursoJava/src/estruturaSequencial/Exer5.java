package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Bruno Isobe 
 *         
 *         Fazer um programa para ler o c�digo de uma pe�a 1, o
 *         n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma
 *         pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2.
 *         Calcule e mostre o valor a ser pago.
 *
 */
public class Exer5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int amount1, amount2;
		double price1, price2, total;
		
		int codigoDoProdutoPrimeiro = scanner.nextInt();
		amount1 = scanner.nextInt();
		price1 = scanner.nextDouble();
		
		int codigoDoProdutoSegundo = scanner.nextInt();
		amount2 = scanner.nextInt();
		price2 = scanner.nextDouble();
		
		total = (amount1 * price1) + (amount2 * price2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		scanner.close();

	}

}
