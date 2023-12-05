package step06;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/29
 * 이름 : 한상민
 * 내용 : 3003. 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
public class Test02 {
	public static void main(String[] args) {

		// 값 입력
		Scanner in = new Scanner(System.in);
		String ch = in.nextLine();
		
		// 입력값에 대한 배열 생성
		String[] chArr = ch.split(" ");

		// 체스 1세트
		int[] set = {1, 1, 2, 2, 2, 8};
		
		// 피스 추가 및 제거
		int[] temp = new int[6];
		for (int i=0 ; i<6 ; i++) {
			temp[i] = set[i] - Integer.parseInt(chArr[i]);
			System.out.print(temp[i]+" ");
		}
		
		in.close();
	}
}