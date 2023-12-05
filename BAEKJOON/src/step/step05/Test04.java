package step05;

import java.util.Scanner;

/*
 * 날짜 : 2023/
 * 이름 : 한상민
 * 내용 : 11654. 아스키 코드
 */
public class Test04 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String a = in.next(); // 문자열 입력
		
		int b = a.charAt(0); // charAt은 char로 반환되므로 이를 이용
		
		System.out.println(b);
		
		in.close();
	}
}
