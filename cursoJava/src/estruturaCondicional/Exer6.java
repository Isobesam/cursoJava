/**
 * 
 */
package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Bruno Isobe 
 *
 */
public class Exer6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double comparation = scanner.nextDouble();
		
		if (comparation < 0.0 || comparation > 100.0) {
			System.out.println("Fora do intervalo!");
		}else if (comparation <= 25) {
			System.out.println("Intervalo [0,25]");
		}else if (comparation <= 50) {
			System.out.println("Intervalo (25,50]");
		}else if (comparation <= 75) {
			System.out.println("Intervalo (50,75]");
		}else
			System.out.println("Intervalo (75,100]");
		
		scanner.close();
	}

}
