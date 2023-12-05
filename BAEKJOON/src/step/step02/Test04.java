package step02;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		
		//1, 4사분면
		if(x>0) { 
			if(y>0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
			
		//2, 3사분면
		}else { 
			if(y>0) {
				System.out.println(2);
		}else {
			System.out.println(3);
		}
		}
		in.close();
		
	}
}