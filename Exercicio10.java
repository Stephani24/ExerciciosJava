import java.util.*;

public class Exercicio10 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a[];
		a = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Insira o " +(1+ i) + "� numero ");
			a[i] = in.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("Analise do numero :" + a[i]);

			for (int j = 1; j < a[i]; j++) {
				if (a[i] % j == 0) {
					System.out.println(j + " � divisor");
				}
			}
			System.out.println();

		}

	}

}
