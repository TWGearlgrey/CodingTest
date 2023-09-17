package step10;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/17
 * 이름 : 한상민
 * 내용 : 14215. 세 막대
 */
public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 1. 크기 순 정렬
		int[] arr = {a, b, c};
		
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		a = arr[0];
		b = arr[1];
		c = arr[2];
		
		// 2. 길이 조절
		if(a == b) {
			System.out.print(a+b+c);
			
		}else if(a > b) {
			if(a < b+c-1) {
				System.out.print(a+b+c);
			}else {
				System.out.print(2*(b + c) - 1);
			}
		}
		
		sc.close();
	}
}