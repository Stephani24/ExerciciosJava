import java.util.*;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i, tester = 0, cont, soma = 0;

		a = new int[10];
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o " + (1 + i) + "� valor");
			a[i] = in.nextInt();
		}

		for (i = 0; i < 10; i++) {
			tester = 0;
			for (cont = 1; cont <= a[i]; cont++) {

				if (a[i] % cont == 0) {
					tester++;
				}
			}

			if (tester == 2) {
				System.out.println("O "+(i+1)+"� n�mero, isto � "+a[i]+" � primo");
				soma++;

			} else {
				System.out.println("O "+(i+1)+"� n�mero, isto � "+a[i]+" n�o � primo");
			}
		}
		System.out.println("O total de n�meros primos � "+soma);

	}
}
