package step06;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/30
 * 이름 : 한상민
 * 내용 : 2444. 별 찍기 -7
 */
public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i=1 ; i<=2*n-1 ; i++) {
			
			// i가 1부터 n까지
			if (i <= n) {
				for(int j=0 ; j<n-i ; j++) {
					System.out.print(" ");
				}
				for(int j=0 ; j<2*i-1 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			// i가 n+1부터 2n-1까지
			if(i > n) {
				for(int j=n-i ; j<0 ; j++) {
					System.out.print(" ");
				}
				for(int j=1 ; j<2*(2*n-i) ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}
