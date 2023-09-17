package step04;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 10813. 공 바꾸기
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		// 바구니 번호에 맞는 공 넣기
		int basket[] = new int[N];
		for( int k=0 ; k<N ; k++ ) {
			basket[k] = k+1;
		}
		
		// 바구니 속 공 교환하기
		for( int k=0 ; k<M ; k++ ) {
			int i = in.nextInt();
			int j = in.nextInt();
			
			int temp = basket[i-1];
			basket[i-1] = basket[j-1];
			basket[j-1] = temp;
		}
		
		// 교환이 끝난 공 순서대로 출력하기
		for( int k=0 ; k<N ; k++ ) {
			System.out.print(basket[k]+" ");
		}
		in.close();
	}
}