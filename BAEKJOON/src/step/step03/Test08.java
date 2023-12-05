package step03;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/21
 * 이름 : 한상민
 * 내용 : 11022번. A+B-8
 */
public class Test08 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
	
		for (int i = 1 ; i <= T ; i++ ) {
			int A = in.nextInt();
			int B = in.nextInt();
			int sum = A+B;
			System.out.print("Case #"+i+": ");
			System.out.println(A + " + " + B + " = " + sum);
		}
	in.close();
	}
}
