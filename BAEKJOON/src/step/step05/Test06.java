package step05;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/27
 * 이름 : 한상민
 * 내용 : 10809. 알파벳 찾기
 */
public class Test06 {
	public static void main(String[] args) {
		
		// 문자열 입력
		Scanner in = new Scanner(System.in);
		String S = in.next();
		
		// 문자열과 비교를 위한 배열
		char[] alp = {'a', 'b', 'c', 'd', 'e', 
					'f', 'g', 'h', 'i', 'j', 
					'k', 'l', 'm', 'n', 'o', 
					'p', 'q', 'r', 's', 't', 
					'u', 'v', 'w', 'x', 'y', 'z'};
		
		// 모든 원소가 -1인 배열 생성 ~> 위치값을 기록하기 위함
		int[] val = new int[26];
		for ( int i=0 ; i<26 ; i++ ) {
			val[i] = -1;
		}
		
		// 비교하여 위치값 넣어주기 ~ 최초의 값만 받기 위해 역순으로 실행
		int length = S.length(); // 입력받은 문자열의 길이 파악
		
		for ( int i=length-1 ; i>=0 ; i-- ) {
			for ( int j=0 ; j<26 ; j++ ) {
				if ( S.charAt(i) == alp[j] ) {
					val[j] = i;
				}
			}
		}
		
		// 출력단계
		for ( int i=0 ; i<26 ; i++ ) {
			System.out.print(val[i]+" ");
		}
		
		in.close();
	}
}
