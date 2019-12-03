import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], c[], maior = 0, menor = 0, i;
		a = new int[10];
		b = new int[10];
		c = new int[10];

		for (i = 0; i < 10; i++) {
			System.out.println("Insira o " + (i + 1) + "º valor");
			a[i] = in.nextInt();
			b[i] = a[i];
			c[i] = a[i];
		}

		for (i = 0; i < b.length; i++) {
			System.out.print(+b[i] + " ");

		}
		System.out.println(" ");
		for (int j = c.length - 1; j >= 0; j--) {
			System.out.print(+c[j] + " ");

		}

	}

}
