import java.util.*;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a[];
		int num;
		a = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Insira o "+(i+1)+"� valor");
			a[i] = in.nextInt();
		}

		System.out.println("Digite um valor para procurar no vetor");
		num = in.nextInt();

		for (int i = 0; i < a.length; i++) {

			if (a[i] == num) {
				System.out.println("A posi��o do vetor � "+ i+" isto �, a "+(1+i)+"� n�mero ");

			}
		}
	}
}
    