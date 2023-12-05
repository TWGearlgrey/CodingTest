package step10;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/13
 * 이름 : 한상민
 * 내용 : 27323. 직사각형
 */
public class Test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[][] sq = new int[a][b];
		
		int h = sq.length;
		int w = sq[0].length;
		
		System.out.print(h*w);
		
		sc.close();
	}
}