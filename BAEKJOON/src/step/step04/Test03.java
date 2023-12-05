package step04;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 10818번. 최소, 최대
 */
public class Test03 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];
		
		for( int i=0 ; i<N ; i++ ) {
			int A = in.nextInt();
			arr[i] = A;
		}

		int min = arr[0];
		int max = arr[0];
		
		for( int i=1 ; i<N ; i++ ) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}	
		
		for( int i=1 ; i<N ; i++ ) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print(min + " " + max);
		
		in.close();
	}
}
