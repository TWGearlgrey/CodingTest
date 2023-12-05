package step13;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/31
 * 이름 : 한상민
 * 내용 : 2750. 수 정렬하기
 */
public class Test01 {
	public static void main(String[] args) {
		
		// n과 수 입력 (-1000 ~ 1000)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arrs = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arrs[i] = sc.nextInt();
		}
		sc.close();
		
		// 오름차순 정렬
		Arrays.sort(arrs);
		
		// 출력
		for(int arr : arrs) {
			System.out.println(arr);
		}
	}
}