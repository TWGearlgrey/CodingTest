package step03;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 10951번. A+B-4
 */
public class Test12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()) {
			int A = in.nextInt();
			int B = in.nextInt();
			
			System.out.println(A+B);
		}
		in.close();
	}
}
