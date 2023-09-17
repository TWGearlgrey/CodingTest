package step04;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 10818번. 최소, 최대
 */
public class Test04 {
	public static void main(String[] args) {
		
		//서로 다른 9개의 자연수 입력
		Scanner in = new Scanner(System.in);
		int arr[] = new int[9]; //자연수를 담을 배열 생성
		
		for ( int i=0 ; i<9 ; i++ ) {
			int n = in.nextInt();
			arr[i] = n;
		}
		
		//출력값 담을 임시변수 temp와 index 생성
		int temp = arr[0];
		int index = 0;
		
		//최대값 구하기
		for ( int i=1 ; i<9 ; i++ ) {
			if( temp < arr[i] ) {
				temp = arr[i];
				index = i;
			}
		}
		
		//결과 출력
		System.out.println(temp);
		System.out.println(index+1); //인덱스 값이 아닌, 순서를 구하는 것이라 +1하였음

		in.close();
	}
}