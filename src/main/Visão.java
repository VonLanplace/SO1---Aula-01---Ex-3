package main;

import java.util.Scanner;

public class Visão {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int tamanho = in.nextInt();
			if (tamanho <= 10) {
				int[] numeros = new int[tamanho];
				for (int i = 0; i < numeros.length; i++) {
					numeros[i] = in.nextInt();
				}
				Controle.TesteValores(numeros);
			} else {
				System.out.println("Erro - Tamanho inválido");
			}
		} catch (Exception e) {
			System.out.println("Erro - Exception" + e);
			// TODO: handle exception
		}
	}
}