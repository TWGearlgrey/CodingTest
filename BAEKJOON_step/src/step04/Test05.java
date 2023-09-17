package step04;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 10810. 공 넣기
 */
public class Test05 {
	public static void main(String[] args) {
		
		//N, M 입력값 받음
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		//길이 M의 배열(바구니) 생성
		int basket[] = new int[N];
		
		//i, j, k 입력값 받음
		for ( int m=0 ; m<M ; m++ ) {
			int i = in.nextInt();
			int j = in.nextInt();
			int k = in.nextInt();
			
			//i부터 j까지 k 넣기
			for( ; i<=j ; i++ ) {
				basket[i-1] = k;
			}
		}
		
		//완성된 배열 출력
		for(int m=0 ; m<N ; m++) {
			System.out.print(basket[m]+" ");
		}
		
		in.close();
	}
}
