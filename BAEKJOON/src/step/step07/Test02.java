package step07;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/05
 * 이름 : 한상민
 * 내용 : 2566. 최댓값
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		// 배열 값 입력
		for(int i=0 ; i<9 ; i++) {
			for(int j=0 ; j<9 ; j++) {
				arr[i][j] = in.nextInt();
			}
		}
			
		// 최대값 구하기
		int max = 0;
		int x = 0;
		int y = 0;
		
		for(int i=0 ; i<9 ; i++) {
			for(int j=0 ; j<9 ; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					x = i;
					y = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.print( (x+1) + " " + (y+1) );
		
		in.close();
	}
}
