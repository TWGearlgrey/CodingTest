package step13;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/31
 * 이름 : 한상민
 * 내용 : 25305. 커트라인
 */
public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arrs = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arrs[i] = sc.nextInt();
		}
		
		sc.close();
		
		// 오름차순 정렬
		Arrays.sort(arrs);
		
		// 커트라인 출력
		System.out.println(arrs[n-m]);
	}
}