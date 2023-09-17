package step08;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/06
 * 이름 : 한상민
 * 내용 : 2745. 진법 변환
 * 
 * Math.pow(숫자, 지수); 를 통해 지수 표현이 가능
 */
public class Test01 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String n = in.next();
		int b = in.nextInt();
		
		int len = n.length();
		int sum = 0;
		
		// b진법 더하기
		for(int i=0 ; i<len ; i++) {
			int part = (int) n.charAt(i);
			
			// 1~9 경우
			if(part < 65) {
				sum += Math.pow(b, len-i-1) * (part - 48); //1의 아스키코드가 49
			
			// A~Z 경우
			} else {
				sum += Math.pow(b, len-i-1) * (part - 55); //A의 아스키코드가 65
			}
		}
		
		System.out.println(sum);
		
		in.close();
	}
}
