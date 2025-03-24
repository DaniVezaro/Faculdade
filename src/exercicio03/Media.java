package exercicio03;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite outro número: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite outro número: ");
		double n3 = sc.nextDouble();
		
		double soma = n1+n2+n3;
		double media = soma / 3;
		
		System.out.println("A média dos números digitados é " + media);
		
		sc.close();

		
	}

}
