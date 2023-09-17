package step03;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 2439번. 별 찍기 - 2
 */
public class Test10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = i+1 ; j < N ; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		in.close();
	}
}
