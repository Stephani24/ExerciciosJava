import java.util.*;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], cont;
		a = new int[10];
		b = new int[10];

		for (cont = 0; cont < 10; cont++) {
			System.out.println("Digite o valor " + (1 + cont) + "º valor");
			a[cont] = in.nextInt();
			b[cont] = (int) Math.sqrt(a[cont]);

		}

		for (cont = 0; cont < 10; cont++) {
			System.out.println("O " + (1 + cont) + "º valor de B é " + b[cont]);
		}

	}

}
