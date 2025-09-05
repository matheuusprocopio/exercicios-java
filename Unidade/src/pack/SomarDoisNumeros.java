package pack;

import java.util.Scanner;

public class SomarDoisNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2, soma;
		
		System.out.println("Digite um numero: ");
		n1 = scanner.nextInt();
		System.out.println("Digite outro numero: ");
		n2 = scanner.nextInt();
		soma = n1 + n2;
		
		System.out.println("A soma dos dois numeros é " + soma);
		scanner.close();
	}
}
