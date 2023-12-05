package step05;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/26
 * 이름 : 한상민
 * 내용 : 27866. 문자와 문자열
 */
public class Test01 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int i = in.nextInt();
		
		String input = S;
		
		System.out.println(input.substring(i-1, i));
		
		in.close();
	}
}