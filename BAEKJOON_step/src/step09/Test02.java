package step09;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/11
 * 이름 : 한상민
 * 내용 : 2501. 약수 구하기
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ind = sc.nextInt(); 
		int cnt = 0;
		
		for(int i=1 ; i<=num ; i++) {
			if(num % i == 0) {
				cnt++;
			}
			
			if(cnt == ind) {
				System.out.println(i);
				break;
			}
			
			if(i == num && ind > cnt) {
				System.out.println(0);
			}
		}
		
		sc.close();
	}
}
