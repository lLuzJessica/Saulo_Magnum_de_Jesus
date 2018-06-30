package br.com.liax.Fibonacci;

public class Fibonacci {
	private int anterior;
	private int proximo;

	public void getFibonacci(int f) {
		int i = 1;
		anterior = 0;
		proximo = 1;
		while (i <= f) {
			proximo = proximo + anterior;
			anterior = proximo - anterior;
			System.out.print(anterior);
			if (i < f)
				System.out.print(",");
			i++;
		}

	}

}
