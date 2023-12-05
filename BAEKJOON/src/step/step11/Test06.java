package step11;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/21
 * 이름 : 한상민
 * 내용 : 24267. 알고리즘 수업 - 알고리즘의 수행 시간 6
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long count = n*(n-1)*(n-2)/6;
		
		System.out.println(count);
		System.out.println(3);
		
		sc.close();
	}
}
