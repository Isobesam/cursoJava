/**
 * 
 */
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Bruno Isobe 
 * 
 * 		   Fazer um programa que leia o número de um funcionário,
 *         seu número de horas trabalhadas, o valor que recebe por hora e
 *         calcula o salário desse funcionário. A seguir, mostre o número e o
 *         salário do funcionário, com duas casas decimais.
 * 
 */
public class Exer4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double timeOfWorking, remunerationOfEmployee, remuneration;
		int numberOfEmployer;
		
		numberOfEmployer = sc.nextInt();
		timeOfWorking = sc.nextDouble();
		remunerationOfEmployee = sc.nextDouble();
		remuneration = timeOfWorking * remunerationOfEmployee;
	
		System.out.printf("NUMBER: %d%nSALARY: U$ %.2f", 
				numberOfEmployer, 
				remuneration);
		
		sc.close();
	}

}
