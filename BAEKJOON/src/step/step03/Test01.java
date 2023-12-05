package step03;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		for (int M = 1 ; M<=9 ; M++)
			System.out.println(N + " * " + M + " = " + M*N);

		in.close();
	}
}
