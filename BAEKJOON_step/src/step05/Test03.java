package step05;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/27
 * 이름 : 한상민
 * 내용 : 9086. 문자열
 */
public class Test03 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt(); // 테스트케이스 입력
		
		for ( int i=0 ; i<tc ; i++ ) {
			String word = in.next(); // tc차례 문자열 입력
			
			int lg = word.length(); // 문자열 길이 파악
			System.out.print(word.charAt(0)); // 첫번째 글자 출력
			System.out.println(word.charAt(lg-1)); // 마지막 글자 출력
		}
		in.close();
	}
}
