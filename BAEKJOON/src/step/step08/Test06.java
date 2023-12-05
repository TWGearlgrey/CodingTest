package step08;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/10
 * 이름 : 한상민
 * 내용 : 1193. 분수찾기
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		// x번째 숫자가 속한 줄 찾기
		int count = 0;
		int line = 0;
		
		while(count < x) {
			for(int i=0 ; i<=line ; i++) {
				count++;
			}
			line++;
		}
		
		// line 줄에 있는 숫자가 담긴 배열 생성
		int[] arr = new int[line];
		for(int i=0 ; i<line ; i++) {
			arr[i] = i+1;
		}
		
		// x번째 숫자 출력하기 (짝수줄은 분모내림차순, 홀수줄은 분모오름차순)
		int n = x - (count - line) -1;
		
		if(line%2 == 0) {
			System.out.println(arr[n]+"/"+arr[line-n-1]);
		} else {
			System.out.println(arr[line-n-1]+"/"+arr[n]);
		}
		
		sc.close();
	}
}
