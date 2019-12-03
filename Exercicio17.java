import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a[];
		
		a = new int[10];

		for (int i = 0; i < a.length; i++) {

			System.out.println("Insira o "+(1+i)+"º valor");
			a[i] = in.nextInt();

		}


		boolean palindromo = true;
		for (int i = 0; i < a.length / 2; i++) {

			if (a[i] != a[a.length - 1 - i]) {
				palindromo = false;
				break;

			}
		}

		System.out.print("Vetor a = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		if (palindromo) {
			System.out.println("É um Palindromo");

		} else {
			System.out.println("Não é palindromo");

		}
	}

}