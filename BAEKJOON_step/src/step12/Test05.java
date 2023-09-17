package step12;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/30
 * 이름 : 한상민
 * 내용 : 1436. 영화감독 숌
 */
public class Test05 {
	// int -> String 변환 메서드
	public static String st(int num) {
		return String.valueOf(num);
	}
	
	// 메인
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close(); // 입력이 끝났으니 바로 닫아 줌
		
		int srs = 666;
		int cnt = 1;
		
		while(cnt < n) {
			srs++;
			if(st(srs).contains("666")) {
				cnt++;
			}
		}
		System.out.println(srs);
	}
}