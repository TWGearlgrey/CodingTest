package step13;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/31
 * 이름 : 한상민
 * 내용 : 2587. 대표값2
 */
public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arrs = new int[5];
		
		for(int i=0 ; i<5 ; i++) {
			arrs[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arrs);
		
		System.out.println(Arrays.stream(arrs).sum()/5);
		System.out.println(arrs[2]);
	}
}