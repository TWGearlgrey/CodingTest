package step03;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int c = in.nextInt(); // 입력할 케이스 개수
		
		for (int i = 0 ; i < c ; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println(A+B);
		}
		
		in.close();
	}
}
