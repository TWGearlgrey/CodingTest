package step01;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt(); 
		int B = in.nextInt();
		
		//A와 B의 1의 자리 곱
		int one = B%10;
		int m1 = A*one;
		
		//A와 B의 10의 자리 곱
		int ten = (B%100 - one)/10;
		int m2 = A*ten;
		
		//A와 B의 100의 자리 곱
		int hunit = (B - B%100)/100;
		int m3 = A*hunit;
		
		//A와 B의 곱
		int m4 = A*B;
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		in.close();
		
	}
}
