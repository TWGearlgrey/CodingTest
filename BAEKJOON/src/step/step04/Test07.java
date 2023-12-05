package step04;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 5597. 과제 안 내신 분..?
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int stdNo[] = new int[28];
		
		//1. 1~30까지 숫자 중 28개의 숫자 입력을 받아 배열에 담음
		for( int i=0 ; i<28 ; i++ ) {
			int n = in.nextInt();
			stdNo[i] = n;
		}
		
		//2. 1~30까지 숫자 중 누락된 숫자 찾기
		//2-1. 1~30이 담긴 배열 생성
		int temp[] = new int[30];
		for ( int i=0 ; i<30 ; i++) {
			temp[i] = i+1;
		}
		
		//2-2. 일치하는 값은 배열에서 제외(0으로 처리)
		for ( int i=0 ; i<28 ; i++ ) {
			for ( int j=0 ; j<30 ; j++ ) {
				if( temp[j] == stdNo[i] ) {
					temp[j] = 0;
					break;
				}
			}
		}
		//2-3. 0이 아닌 배열만 출력
		for ( int i=0 ; i<30 ; i++ ) {
			if ( temp[i] != 0 ) {
				System.out.println(temp[i]);
			}
		}
		in.close();
	}
}
