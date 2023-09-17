package step12;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/24
 * 이름 : 한상민
 * 내용 : 2231. 분해합
 */
public class Test02 {
	public static void main(String[] args) {
		
		// 입력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 비교를 위한 tmpNum과 출력을 위한 min 변수 생성 
		int  tmpNum = num;
		int  min = 0; 
		
		// 생성자 찾기
		for(int i=tmpNum ; i>=0 ; i--) {
			
			String tmpSt = String.valueOf(i);
			
			int temp = i;
			
			for(int j=0 ; j<tmpSt.length() ; j++) {
				temp += tmpSt.charAt(j) - 48;
			}
			
			if(temp == num) {
				min = i;
			}
		}
		sc.close();
		
		System.out.println(min);
	}
}
