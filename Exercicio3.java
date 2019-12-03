import java.util.*;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int a[], i, b[];
		a = new int[10];
		b = new int[10];
		
		for (i = 0; i < 5; i++) {

			System.out.println("Digite o " + (1 + i) + "º valor");
			a[i] = numero.nextInt();

		}

		for (i = 4; i >= 0; i--) {

			b[i] = a[i];

			System.out.println(b[i]);

		}
	}
}