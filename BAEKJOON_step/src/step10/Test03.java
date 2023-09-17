package step10;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/17
 * 이름 : 한상민
 * 내용 : 3009. 네 번째 점
 */
public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] point = new int[3][2];
		
		// 배열 생성
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<2 ; j++) {
				point[i][j] = sc.nextInt();
			}
		}

		// x, y축 각 안겹치는 값 구하기
		/* x축 */
		int x = 0;
		if(point[0][0] == point[1][0])
			x = point[2][0];
		else if(point[1][0] == point[2][0])
			x = point[0][0];
		else
			x = point[1][0];
		
		/* y축 */
		int y = 0;
		if(point[0][1] == point[1][1])
			y = point[2][1];
		else if(point[1][1] == point[2][1])
			y = point[0][1];
		else
			y = point[1][1];
		
		System.out.println( x + " " + y );
		
		sc.close();
	}
}
