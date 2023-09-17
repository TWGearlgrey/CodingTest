package step08;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/10
 * 이름 : 한상민
 * 내용 : 2720. 세탁소 사장 동혁
 */
public class Test03 {
	public static void main(String[] args) {

		// 테스트케이스 tc 입력
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		
		// 동전 종류 및 잔돈 갯수
		int[] coins = {25, 10, 5, 1};
		int[] ea = new int[4];
		
		// 케이스 tc개 입력
		for(int i=0 ; i<tc ; i++) {
			int c = in.nextInt();
			
			for(int j=0 ; j<coins.length ; j++) {
				ea[j] = c/coins[j];
				c %= coins[j];
			}
			System.out.printf("%d %d %d %d\n", ea[0], ea[1], ea[2], ea[3]);
		}
		
		in.close();
	}
}
