package step04;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 10807번. 개수 세기
 */
public class Test01 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int arr[] = new int[N];
		
		for( int i=0 ; i<N ; i++ ) {
			int M = in.nextInt();
			arr[i] = M;
		}
		
		int L = in.nextInt();
		int j = 0;
		
		for( int i=0 ; i<N ; i++ ) {
			if(arr[i] == L) {
				j++;
			} 		
		} 
		System.out.println(j);
		in.close();
	}
}
