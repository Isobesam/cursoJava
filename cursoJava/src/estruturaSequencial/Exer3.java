package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Bruno Isobe 
 * 		   
 * 		   Fazer um programa para ler quatro valores inteiros A, B, C e D.
 *         A seguir, calcule e mostre a diferen�a do produto de A e B pelo
 *         produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
 *
 */
public class Exer3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = ((A * B) - (C * D));
		
		System.out.println("DIFERENCA: " + dif);
	
		sc.close();
	}

}
