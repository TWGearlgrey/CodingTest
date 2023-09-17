package step05;

import java.util.Scanner;

/*
 * 날짜 : 2023/
 * 이름 : 한상민
 * 내용 : 11720. 문자열
 */
public class Test05 {
	public static void main(String[] args) {
		
		// 숫자 N개와 N개의 숫자 num을 입력 받음
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String num = in.next();
		
		// N개의 숫자를 모두 더함
		int sum = 0; 
		for( int i=0 ; i<N ; i++ ) {
			int a = Character.getNumericValue(num.charAt(i)); // 유니코드 문자 출력을 막기 위함
			sum += a;
		}
		System.out.println(sum);
		
		in.close();
	}
}
