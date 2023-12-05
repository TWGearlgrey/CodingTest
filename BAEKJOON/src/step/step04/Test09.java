package step04;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/26
 * 이름 : 한상민
 * 내용 : 10811. 바구니 뒤집기
 */
public class Test09 {
	public static void main(String[] args) {
		
		// 1~N까지의 바구니 생성
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] basket = new int[N];
		for( int i=0 ; i<N ; i++ ) {
			basket[i] = i+1;
		}
		
		// M개의 테스트케이스, 방법 i,j 
		int M = in.nextInt();
		for( int h=0 ; h<M ; h++ ) {
			for ( int i = in.nextInt(), j = in.nextInt() ; i<=j ; i++, j-- ) {
				int temp = basket[i-1];
				basket[i-1] = basket[j-1]; // 인덱스는 0부터 시작하므로 -1을 해줌
				basket[j-1] = temp;
			}
		}
		
		// 출력하기
		for ( int i=0 ; i<N ; i++ ) {
			System.out.print(basket[i] + " ");
		}
		in.close();
	}
}
