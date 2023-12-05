package step02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int ex = in.nextInt();
		
		if (ex >= 90 && ex <= 100) {
			System.out.println("A");
			
		}else if (ex >= 80 && ex <= 89) {
			System.out.println("B");
			
		}else if (ex >= 70 && ex <= 79) {
			System.out.println("C");
			
		}else if (ex >= 60 && ex <= 69) {
			System.out.println("D");
			
		}else System.out.println("F");
		
		in.close();
	}
}