package step03;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 2438번. 별 찍기 - 1
 */
public class Test09 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}
}
