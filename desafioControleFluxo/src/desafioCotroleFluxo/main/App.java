package desafioCotroleFluxo.main;

import java.util.Scanner;

import desafioCotroleFluxo.application.Contador;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindo ao contador de elementos!");
		System.out.println("Digite dois números inteiros positivos diferentes, onde o primeiro é menor que o segundo.");
		System.out.print("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		sc.close();
		try {
			
			Contador contador = new Contador(numero1, numero2);
			contador.imprimeElementos();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
 