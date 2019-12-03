import java.util.*;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[];

		a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Insira o " + (1+i) + "° numero ");
			a[i] = in.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("Tabuada de " + a[i]);

			for (int j = 1; j < 11; j++) {
				System.out.println(j + "x" + a[i] + " = " + (a[i] * j));
			}
			System.out.println();
		}

	}
}