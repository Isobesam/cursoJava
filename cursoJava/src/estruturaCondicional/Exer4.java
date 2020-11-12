/**
 * 
 */
package estruturaCondicional;

import java.util.Scanner;

/**
 * @author Bruno Isobe 
 * 
 *         Leia a hora inicial e a hora final de um jogo. A seguir
 *         calcule a dura��o do jogo, sabendo que o mesmo pode come�ar em um dia
 *         e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de
 *         24 horas.
 *
 */
public class Exer4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int startGame = scanner.nextInt();
		int finishGame = scanner.nextInt();
		
		int timeGame;
		
		if (startGame < finishGame) {
			timeGame = finishGame - startGame;
		} else {
			timeGame = 24 - startGame + finishGame;
		}
		
		System.out.printf("O JOGO DUROU %dh", timeGame);
		
		scanner.close();
	}

}
