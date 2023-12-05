package step08;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/10
 * 이름 : 한상민
 * 내용 : 2903. 중앙 이동 알고리즘
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 반복횟수 지정
		int n = in.nextInt();
		
		// f(x) = (2x-1)^2
		int rs = 2;
		for(int i=0 ; i<n ; i++) {
			rs = rs*2 - 1;
		}
		
		System.out.println((int) Math.pow(rs, 2));
		
		in.close();
	}
}