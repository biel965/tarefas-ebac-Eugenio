package mod5;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Seja bem vindo " + nome);
			
		sc.close();
	}
}

