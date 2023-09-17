package step07;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/05
 * 이름 : 한상민
 * 내용 : 2738. 행렬 덧셈
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 행렬의 크기를 결정할 정수 a, b입력
		int a = in.nextInt();
		int b = in.nextInt();
		
		// 길이가 a, b인 2차원 행렬 생성
		int[][] arr1 = new int[a][b];
		int[][] arr2 = new int[a][b];
		
		// 2차원행렬 원소값 입력
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<b ; j++) {
				arr1[i][j] = in.nextInt();
			}
		}
		
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<b ; j++) {
				arr2[i][j] = in.nextInt();
			}
		}
		
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<b ; j++) {
				System.out.print(arr1[i][j] + arr2[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		in.close();
	}
}
