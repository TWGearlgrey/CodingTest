package step08;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/10
 * 이름 : 한상민
 * 내용 : 2292. 벌집
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 방 번호 입력
		int n = in.nextInt();
		
		// '이전 최대값 + 등비수열'을 이용해 범위 지정 
		int c=1, i=0;
		while(true) {
			if(n <= c + i*6) {
				System.out.print(i+1);
				break;
			} else {
				c = c + i*6;
				i++;
			}
		}
		in.close();
	}
}