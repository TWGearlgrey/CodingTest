package step11;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/20
 * 이름 : 한상민
 * 내용 : 24265. 알고리즘 수업 - 알고리즘의 수행 시간 4
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long count = n * ( n -1 ) / 2;
			
		System.out.println(count);
		System.out.println(2);
		
		sc.close();
	}
}
