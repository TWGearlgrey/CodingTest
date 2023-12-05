package step12;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/21
 * 이름 : 한상민
 * 내용 : 2798. 블랙잭
 */
public class Test01 {
	public static void main(String[] args) {
		// 카드 입력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cards = new int[n];

		for(int i=0 ; i<n ; i++) {
			cards[i] = sc.nextInt();
		}
		
		// 최대값을 담을 변수 생성
		int max = 0;
		
		// 카드 3장 선택
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				for(int k=0; k<n ; k++) {
					
					// 고른 카드가 모든 다른 카드일 때 최대값 비교 실행
					if(i != j && j != k && i != k) {
						
						int sum = cards[i] + cards[j] + cards[k];
						
						if(sum <= m && sum > max) {
							max = sum;
						}
					}
				}
			}
		}
		System.out.println(max);
		
		sc.close();
	}
}
