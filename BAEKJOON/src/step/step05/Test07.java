package step05;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/27
 * 이름 : 한상민
 * 내용 : 2675. 문자열 반복
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int tc = in.nextInt(); // 테스트케이스 tc 입력
		
		for ( int i=0 ; i<tc ; i++ ) {
			int r = in.nextInt(); // 반복횟수 r 입력
			String s = in.next(); // 문자열 s 입력
			
			int length = s.length();
			
			for ( int j=0 ; j<length ; j++ ) {
				for ( int k=0 ; k<r ; k++ ) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.print("\n");
		}
		
		in.close();
	}
}
