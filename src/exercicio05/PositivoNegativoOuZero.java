package exercicio05;

import java.util.Scanner;

public class PositivoNegativoOuZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número ");
		int numero = sc.nextInt();

		if (numero > 0) {
			System.out.println("Seu número é positivo");
		} else if (numero < 0) {
			System.out.println("Seu número é negativo");
		} else {
			System.out.println("Seu número é zero");
		}

		sc.close();
	}

}
