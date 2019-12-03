import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a[], b[], c[];

		a = new int[10];
		b = new int[a.length];
		c = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			System.out.println("Insira o "+(1+i)+"º valor para o vetor A");
			a[i] = in.nextInt();
		}

		for (int i = 0; i < b.length; i++) {

			System.out.println("Insira o "+(1+i)+"º valor para o vetor B");
			b[i] = in.nextInt();

			if (a[i] == b[i]) {
				c[i] = 0;
			} else if (a[i] > b[i]) {
				c[i] = 1;
			} else {
				c[i] = -1;
			}

		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor C = ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();

	}

}