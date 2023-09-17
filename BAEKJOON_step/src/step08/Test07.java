package step08;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/10
 * 이름 : 한상민
 * 내용 : 2869. 달팽이는 올라가고 싶다.
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 A, B, V 입력
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		// v값에 a를 빼고 a-b로 나눈다.
		int temp = (v-a) / (a-b);
		int day = 1+temp;
		
		if(((v-a) % (a-b)) != 0) {
			day++;
		}
		
		System.out.println(day);
		
		/** 시간 초과로 인해 삭제*/
		//int m = 0;
		//for(int day=1 ; m<v ; day++) {
		//	m += a;
		//	if(m >= v) {
		//		System.out.println(day);
		//		break;
		//	}
		//	m -= b;
		//}
		
		sc.close();
	}
}