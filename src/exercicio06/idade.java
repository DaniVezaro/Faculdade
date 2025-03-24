package exercicio06;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua idade ");
		int idade = sc.nextInt();

		if (idade > 17) {
			System.out.println("Você é maior de idade.");
		} else if (idade < 17) {
			System.out.println("Você é menor de idade");
		}
		sc.close();
	}
}