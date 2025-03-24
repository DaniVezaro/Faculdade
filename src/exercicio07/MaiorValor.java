package exercicio07;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número ");
		int n1 = sc.nextInt();
		System.out.print("Digite outro número ");
		int n2 = sc.nextInt();
		System.out.print("Digite outro número ");
		int n3 = sc.nextInt();
		
		int maior = n1;
		
		if (n2 > maior) {
			maior = n2;
		} 
		if (n3 > maior) {
			maior = n3;
		}
		System.out.println("O maior valor é: " + maior);
		
		sc.close();

	}

}
