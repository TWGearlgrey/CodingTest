package step11;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/20
 * 이름 : 한상민
 * 내용 : 24266. 알고리즘 수업 - 알고리즘의 수행 시간 5
 * 
 * 오답 : long count = (long) Math.pow(n, 3);으로 풀면 오차가 발생한다.
 */
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long count = n * n * n;
		
		System.out.println(count);
		System.out.println(3);
		
		sc.close();
	}
}
