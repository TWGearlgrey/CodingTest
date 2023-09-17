package step03;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for (int i=1 ; i<=n ; i++) {
			sum += i; 
		} 
		System.out.println(sum); 
		// sum을 for문 안에서 선언하면 for문 밖에서는 sum 사용 안 됨
		
		in.close();
	}
}
