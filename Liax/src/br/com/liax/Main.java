package br.com.liax;

import java.util.Scanner;

import br.com.liax.Fibonacci.Fibonacci;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		Fibonacci fibonacci = new Fibonacci();
		Scanner ler = new Scanner(System.in);
		while (n != 0) {
			System.out.printf("Informe o numero Fibonnaci(Zero para sair):");
			n = ler.nextInt();
			if (n == 0)
				System.exit(n);
			fibonacci.getFibonacci(n);
			System.out.println("");
		}

	}

}
