package main;

public class Controle {
	public static void TesteValores(int[] vetor) {
		for (int num : vetor) {
			if (num % 2 == 1) {
				System.out.println(num + " é impar!");
			} else if (num % 10 == 0) {
				System.out.println(num + " é par e multiplo de 10!");
			}
		}
	}
}
