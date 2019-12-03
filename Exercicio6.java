import java.util.*;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a[], b[];

		a = new int[20];
		b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Insira o " +(1+i) + "° numero ");
			a[i] = in.nextInt();
		}

		int j = 0;

		for (int n = 0; n < a.length; n++) {
			if (a[n] % 2 == 0) {
				b[j] = a[n];
				j++;
			}
		}

		for (int n = 0; n < a.length; n++) {
			if (a[n] % 2 != 0) {
				b[j] = a[n];
				j++;
			}
		}

		System.out.print("Vetor A =");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();

		System.out.print("vetor B =");
		for (int i = 0; i < j; i++) {
			System.out.print(b[i] + ", ");
		}
	}
}
	