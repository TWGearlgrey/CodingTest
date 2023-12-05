package step04;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 10871번. X보다 작은 수
 */
public class Test02 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		
		for( int i=0 ; i<N ; i++ ) {
			int A = in.nextInt();
			if( A < X ) {
				System.out.print(A+" ");
			}
		}
		in.close();
	}
}