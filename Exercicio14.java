import java.util.*;
import java.util.Arrays;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], c[], i, j, tamanho = 0;

		a = new int[10];
		b = new int[10];
		c = new int[tamanho];
		for (i = 0; i < 10; i++) {
			System.out.println("Insira o " + (1 + i) + "º valor para o vetor A");
			a[i] = in.nextInt();
		}

		for (i = 0; i < 10; i++) {
			System.out.println("Insira o " + (1 + i) + "º valor para o vetor B");
			b[i] = in.nextInt();
		}

		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				if (a[i] == b[i]) {
					tamanho++;
					c[i] = b[i];
					System.out.println(c[i] + ", ");
				}

			}

		}

	}
}
