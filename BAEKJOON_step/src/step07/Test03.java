package step07;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/06
 * 이름 : 한상민
 * 내용 : 10798. 세로읽기
 */
public class Test03 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		char[][] arr = new char[15][5]; // 가로5 세로15

		// 배열 초기화
		for(int i=0 ; i<15 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				arr[i][j] = '.';
			}
		}
		
		// 단어 입력
		for(int i=0 ; i<5 ; i++) { // 단어 5차례 받기
			String s = in.next();
			int len = s.length();
			
			for(int j=0 ; j<len ; j++) { // 단어길이 len만큼 세로로 저장
				arr[j][i] = s.charAt(j);
			}
		}
		
		// 단어 출력
		for(int i=0 ; i<15 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(arr[i][j] != '.') {
					System.out.print(arr[i][j]);
				} else { 
					continue;
				}
			}
		}
		in.close();
	}
}
