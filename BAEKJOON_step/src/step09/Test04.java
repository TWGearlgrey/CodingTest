package step09;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/11
 * 이름 : 한상민
 * 내용 : 1978. 소수 찾기
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// tc의 수 입력
		int tc = sc.nextInt();
		
		// 소수의 갯수를 카운트할 변수 생성
		int count = 0;
		
		// tc만큼 정수 n 입력
		for(int i=0 ; i<tc ; i++) {
			int n = sc.nextInt();
			
			// 소수인지 확인하기
			int ea = 0;
			for(int j=1 ; j<=n ;j++) {
				if(n % j == 0 ) {
					ea++;
				}
				if(j==n && ea==2) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
