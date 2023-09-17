package step12;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/26
 * 이름 : 한상민
 * 내용 : 1018. 체스판 다시 칠하기
 */
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 가로, 세로 지정
		int m = sc.nextInt(); 
		int n = sc.nextInt(); 
		
		// 체스판 생성
		String[] board = new String[m];

		for(int i=0 ; i<m ; i++) {
			board[i] = sc.next();
		}

		// 비교할 보드 생성
		char[] sB = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}; // 길이가 8을 넘어가는경우 오류 발생.
		char[] sW = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}; // 위와 같음.
		
		// 탐색
		int stM = 0;
		int stN = 0;
		
		int[] cntStB = {0, 0};
		int[] cntStW = {0, 0};
		
		while(true) {
			
			for(int i=stM ; i<stM+8 ; i++) {
				for(int j=stN ; j<stN+8 ; j++) {
					
					if(i%2 == 0) {
						if(sB[j - stN] == board[i].charAt(j)) {
							cntStB[0]++;
						}else {
							cntStW[0]++;
						}
						
					}else {
						if(sW[j - stN] == board[i].charAt(j)) {
							cntStB[0]++;
						}else {
							cntStW[0]++;
						}
					}
				}
			}
			
			// 더 효율적인 방법 있을 시 기록
			if(cntStB[0] > cntStB[1]) {
				cntStB[1] = cntStB[0];
				cntStB[0] = 0;
			}
			
			if(cntStW[0] > cntStW[1]) {
				cntStW[1] = cntStW[0];
				cntStW[0] = 0;
			}
			
			// 초기화
			cntStB[0] = 0;
			cntStW[0] = 0;
			
			// 반복문 증감식 및 break설정
			if(stN < n-8) { // n=10, 0 1 {2} 3 4 5 6 7 8 9
				stN++;
				
			}else if(stM < m-8) { // m=13, 0 1 2 3 4 {5} 6 7 8 9 10 11 12
				stN = 0;
				stM++;
				
			}else {
				break;
			}
		}
		
		if(cntStB[1] > cntStW[1]) {
			System.out.println(64-cntStB[1]);
		}else {
			System.out.println(64-cntStW[1]);
		}
		
		sc.close();
	}
}