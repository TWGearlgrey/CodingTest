package step12;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/31
 * 이름 : 한상민
 * 내용 : 2839. 설탕배달
 */
public class Test06 {
	public static void main(String[] args) {
		
		// 정수 n 입력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		// n의 5kg, 3kg 최대 개수
		int m = n/5;
		int l = n/3;
		
		// 최소 개수 연산
		outer:for(int i=m ; i>=0 ; i--) {
			for(int j=0; j<=l ; j++) {
				if(5*i + 3*j == n) {
					System.out.print(i+j);
					n = 0;
					break outer;
				}
			}
		}
		
		// 최소갯수 출력이 됐을 땐 -1 출력 x
		if(n != 0) {
			System.out.print(-1);
		}
	}
}