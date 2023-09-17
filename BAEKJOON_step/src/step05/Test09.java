package step05;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/28
 * 이름 : 한상민
 * 내용 : 2908. 상수
 */
public class Test09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 정수 A, B입력 (숫자를 뒤집기 위해 문자열로 입력 받음)
		String a = in.next();
		String b = in.next();
		
		// A, B 뒤집기
		String ar = "", br = "";
		for (int i=2 ; i>=0 ; i--) {
			ar += a.charAt(i);
		}
		
		for (int i=2 ; i>=0 ; i--) {
			br += b.charAt(i);
		}
		
		// A, B 크기 비교
		int big = 0;
		int ar1 = Integer.valueOf(ar);
		int br1 = Integer.valueOf(br);
		
		if (ar1 > br1) {
			big = ar1;
		}else {
			big = br1;
		}
		
		// 큰 값 출력
		System.out.print(big);
		
		in.close();
	}
}
