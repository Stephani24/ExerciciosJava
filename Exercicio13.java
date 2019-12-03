import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[];
		a = new int[10];
		b = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			System.out.println("Insira o " + (1 + i) + "º valor ");
			a[i] = in.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			b[i] = 0;
			for (int j = 0; j <= a[i]; j++) {
				b[i] += j;
			}
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(" ");
		System.out.print("Vetor B = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + ", ");
		}
		System.out.println();
	}
}