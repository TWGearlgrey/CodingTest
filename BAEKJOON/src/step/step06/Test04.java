package step06;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/30
 * 이름 : 한상민
 * 내용 : 10988. 팰린드롬인지 확인하기
 */
public class Test04 {
	public static void main(String[] args) {
		
		// 문자열 입력
		Scanner sc = new Scanner(System.in);
		String alp = sc.next();
		
		// 뒤집힌 글자를 담을 변수 생성
		StringBuilder rv = new StringBuilder();
		
		// 글자 길이 파악
		int len = alp.length();
		
		// 글자 뒤집기
		for (int i=len-1 ; i>=0 ; i--) {
			char re = alp.charAt(i);
			rv.append(re);
		}
		
		// 똑같은지 검사
		if (rv.toString().equals(alp)) { //rv는 StringBuilder라 String과 비교가 안됨
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}