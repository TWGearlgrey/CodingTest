package step07;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/06
 * 이름 : 한상민
 * 내용 : 2563. 색종이
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] paper = new int[100][100];
		
		// 테스트케이스 n 입력 및 합계를 담을 변수 sum 생성
		int tc = in.nextInt();
		int sum = 0;
		
		// 테스트 케이스 n회 만큼 입력
		for(int i=0 ; i<tc ; i++) {
			int w = in.nextInt();
			int h = in.nextInt();
			
			// 검은색종이가 붙는 부분에는 1을 더하고, 이미 붙어있을 경우 1을 곱한다.
			for(int j=w ; j<w+10 ; j++) {
				for(int k=h ; k<h+10 ; k++) {
					if(paper[j][k]==0) {
						paper[j][k] += 1;
					}else if(paper[j][k] ==1) {
						paper[j][k] *= 1;
					}
				}
			}
		}
		
		// 검은 색종이 넓이 출력
		for(int i=0 ; i<100 ; i++) {
			for(int j=0 ; j<100 ; j++) {
				sum += paper[i][j];
			}
		}
		
		System.out.println(sum);
		
		in.close();
	}
}