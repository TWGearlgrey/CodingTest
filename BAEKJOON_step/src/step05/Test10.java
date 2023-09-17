package step05;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/29
 * 이름 : 한상민
 * 내용 : 5622. 다이얼
 */
public class Test10 {
	public static void main(String[] args) {
		
		// 문자열로 입력 받기
		Scanner in = new Scanner(System.in);
		String hp = in.next();
		
		int len = hp.length();
		int count = 0;
		
		// for switch로 시간 카운트하기
		for ( int i=0 ; i<len ; i++ ) {
			switch ( hp.charAt(i) ) {
				case 'A' : case 'B' : case 'C' :
					count+=3;
					break;
					
				case 'D' : case 'E' : case 'F' :
					count+=4;
					break;
				
				case 'G' : case 'H' : case 'I' :
					count+=5;
					break;
				
				case 'J' : case 'K' : case 'L' :
					count+=6;
					break;
				
				case 'M' : case 'N' : case 'O' :
					count+=7;
					break;
				
				case 'P' : case 'Q' : case 'R' : case 'S' :
					count+=8;
					break;
				
				case 'T' : case 'U' : case 'V' :
					count+=9;
					break;
				
				case 'W' : case 'X' : case 'Y' : case 'Z' :
					count+=10;
					break;
			}
		}
		
		System.out.println(count);
		
		in.close();
	}
}
