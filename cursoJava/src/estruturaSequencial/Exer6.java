/**
 * 
 */
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Bruno Isobe
 * 
 *         Fazer um programa que leia tr�s valores com ponto flutuante de
 *         dupla precis�o: A, B e C. Em seguida, calcule e mostre: a) a �rea do
 *         tri�ngulo ret�ngulo que tem A por base e C por altura. b) a �rea do
 *         c�rculo de raio C. (pi = 3.14159) c) a �rea do trap�zio que tem A e B
 *         por bases e C por altura. d) a �rea do quadrado que tem lado B. e) a
 *         �rea do ret�ngulo que tem lados A e B.
 *
 */
public class Exer6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = scanner.nextDouble();
		B = scanner.nextDouble();
		C = scanner.nextDouble();
		
		triangulo = A * C / 2;
		circulo = Math.PI * Math.pow(C, 2);
		trapezio = ((A + B)/2) * C;
		quadrado = A + B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n"
				+ "CIRCULO: %.3f%n"
				+ "TRAPEZIO%.3f%n"
				+ "QUADRADO: %.3f%n"
				+ "RETANGULO: %.2f%n",
				triangulo, circulo, trapezio, quadrado, retangulo);
		scanner.close();
	}

}
