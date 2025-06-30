package desafioCotroleFluxo.application;

import desafioCotroleFluxo.application.exceptions.ParametrosInvalidosException;

public class Contador {
	int numero1;
	int numero2;

	public Contador(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	private int numeroDeElementos() {
		if (numero1 > numero2) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		} else if (numero1 == numero2) {
			throw new ParametrosInvalidosException("Os parâmetros devem ser diferentes.");
		} else {
			return numero2 - numero1;
		}
	}
	

	public void imprimeElementos() {
		int totalDeElementos = numeroDeElementos();
		for(int i = 1; i <= totalDeElementos; i++) {
			System.out.println("Imprimindo o número: " + i);
		}
		System.out.println("Lista final de elementos impressos:");
		System.out.print("[");
		for (int i = 1; i <= totalDeElementos; i++) {
			if (i == totalDeElementos) {
				System.out.print(i + "]");
			} else {
				System.out.print(i + ", ");
			}

		}
	}

}
