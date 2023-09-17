package step05;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/29
 * 이름 : 한상민
 * 내용 : 11718. 그대로 출력하기
 */
public class Test11 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			String str = in.nextLine();
			
			if(str.isEmpty()) {
				break;
			}
			
			System.out.println(str);
		}
		in.close();
	}	
}
