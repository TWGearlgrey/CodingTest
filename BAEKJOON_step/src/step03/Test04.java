package step03;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int X = in.nextInt();
	int N = in.nextInt();
	int sum = 0;
	
	for (int i=0 ; i<N ; i++) {
		int a = in.nextInt();
		int b = in.nextInt();
		
		sum += a*b;
	}
	
	if (X == sum) {
		System.out.println("Yes");
	} else System.out.println("No");
	
	in.close();
	}
}
