package step03;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		for (int i=4 ; i<=N ; i+=4) {
			System.out.print("long ");
		}
		System.out.print("int");
		
		in.close();
	}
}
