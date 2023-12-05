package step02;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		int m = in.nextInt();
		
		int time = h*60 + m - 45;
		
		if(time<0) {
			time += 1440;
			System.out.println((time/60) + " " + (time%60));
		}else {
			System.out.println((time/60) + " " + (time%60));
		}
		
		in.close();
		
	}
}
