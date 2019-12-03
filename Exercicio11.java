import java.util.*;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a[];
		int i;

		a = new double[11];

		for (i = 0; i < a.length; i++) {
			a[i] = Math.pow(2, i);
		}
		System.out.println("O vetor A é: ");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}
}
