package step02;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		
		if (year%4==0) {

			if (year%100!=0) {
				System.out.println(1); 

			}else if (year%400==0) {
				System.out.println(1); 

			}else System.out.println(0);
		}else System.out.println(0);
		
		
		in.close();
		
	}
}
