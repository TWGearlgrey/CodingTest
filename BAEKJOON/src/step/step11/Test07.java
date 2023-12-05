package step11;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/21
 * 이름 : 한상민
 * 내용 : 24313. 알고리즘 수업 - 점근적 표기 1
 */
public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c  = sc.nextInt();
		int n = sc.nextInt();
		
		int result = 1;
		
		for(int i=n ; i<=100 ; i++) {
			if(a*i + b <= c*i) {
				result *= 1;
			}else {
				result *= 0;
				break;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}	
}