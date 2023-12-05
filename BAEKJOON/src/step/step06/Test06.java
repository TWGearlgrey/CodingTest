package step06;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/04
 * 이름 : 한상민
 * 내용 : 2941. 크로아티아 알파벳
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		
		String[] croAlp = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
		String count = input;
		
		// 문자열을 받으면 문자열에 크로아티아 알파벳을 a로 바꾼다.
		for(int i=0 ; i<8 ; i++) {
			count = count.replace(croAlp[i], "a");
		}
		
		// 모든 알파벳이 1글자가 됐으므로 길이를 통해 알파벳 갯수를 출력
		System.out.println(count.length());
		
		in.close();
	}
}
