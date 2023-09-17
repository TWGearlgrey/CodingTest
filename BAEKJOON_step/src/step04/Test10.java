package step04;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/26
 * 이름 : 한상민
 * 내용 : 1546. 평균
 */
public class Test10 {
	public static void main(String[] args) {
		
		//1. 입력 받기
		//1-1. 과목 N개 입력 및 배열 생성
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		float[] exam = new float[N];
		
		//1-2. 과목 별 점수 입력 및 배열에 담기
		for ( int i=0 ; i<N ; i++ ) {
			float sub = in.nextInt();
			exam[i] = sub;
		}
		
		
		//2. 새로운 평균 구하기
		//2-1. 최고 점수 찾기
		float max = exam[0];
		for ( int i=1 ; i<N ; i++ ) {
			if ( max <= exam[i] )
				max = exam[i];
		}
		
		//2-2. 최고 점수를 통해 점수 고치기
		for ( int i=0 ; i<N ; i++ ) {
			exam[i] = exam[i]/max*100;
		}
		
		//2-3. 새로운 점수로 평균 내기
		float sum = 0;
		for ( int i=0 ; i<N ; i++ ) {
			sum += exam[i];
		}
		System.out.println(sum/N);
		
		in.close();
	}
}
