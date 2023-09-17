package step03;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 10952번. A+B-5
 */
public class Test11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int A = in.nextInt();
			int B = in.nextInt();
			if(A==0 && B==0) {
				break;
			}
			System.out.println(A+B);
		}
		in.close();
	}
}
