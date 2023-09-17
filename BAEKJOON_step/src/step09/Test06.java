package step09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/13
 * 이름 : 한상민
 * 내용 : 11653. 소인수분해
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		List<Integer> ns = new ArrayList<>();
		
		// 소인수분해
		if(n != 1) { // n이 2 이상인 경우만 반복문 실행
			int m = 2;
			
			while(m <= n) {
				if(n % m == 0) {
					ns.add(m);
					n /= m;
					
				}else {
					m++;
				}
			}
		}
		
		// 결과 출력
		for(int i=0 ; i<ns.size() ; i++) {
			System.out.println(ns.get(i));
		}
		
		in.close();
	}
}