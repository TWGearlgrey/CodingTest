package step02;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		int m = in.nextInt();
		int time = in.nextInt();
		
		
		int start = h*60 + m;
		int end = start + time;
		
		if (end >= 1440) {
			end -= 1440;
			System.out.println(end/60 + " " + end%60);
		}else {
			System.out.println(end/60 + " " + end%60);
		}
		
		in.close();
	}
}
