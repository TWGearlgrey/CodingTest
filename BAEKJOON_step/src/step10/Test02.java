package step10;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/13
 * 이름 : 한상민
 * 내용 : 1085. 직사각형에서 탈출
 */
public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int[] sq = {x, w-x, h-y, y};
		
		int min = -1;
		for(int i=0 ; i<4 ; i++) {
			if(min < 0) {
				min = sq[i];
			}else if (min > sq[i]) {
				min = sq[i];
			}
		}
		sc.close();
		
		System.out.println(min);
	}
}
