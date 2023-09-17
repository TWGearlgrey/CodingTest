package step04;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22~26
 * 이름 : 한상민
 * 내용 : 3052. 나머지
 */
public class Test08 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int temp[] = new int[10];
		
		//1. 입력 값을 인덱스0부터 차례대로 넣기
		for ( int i=0 ; i<10 ; i++ ) {
			int n = in.nextInt();
			temp[i] = n;
		}
		
		//2. 인덱스별 나머지 값을 인덱스에 넣기
		for ( int i=0 ; i<10 ; i++ ) {
			int temp1 = temp[i]%42;
			temp[i] = temp1;
		}
		
		//3. 같은 값이 몇개 있는지 찾기 - 내림차순 정렬하고 break로 찾기?
		//3-1. 내림차순 정렬
		for ( int i=0 ; i<9 ; i++ ) {
			for ( int j=i+1 ; j<10 ; j++ ) {
				if( temp[i] > temp[j] ) {
					int temp1 = temp[i];
					temp[i] = temp[j];
					temp[j] = temp1;
				}
			}
		}
		
		//3-2. 나머지의 종류가 몇개인지
		int count = 0;
		for( int i=0, j=i+1 ; i<9 && j<10 ; j++ ) {
			if ( temp[i] != temp[j] ) {
				count++;
				i = j;
			} else if ( temp[i] == temp[j] ) {
				i = j;
			}
		}
		count++;
		
		
		System.out.println(count);
		
		in.close();
	}
}
