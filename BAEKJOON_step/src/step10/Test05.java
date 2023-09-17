package step10;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/17
 * 이름 : 한상민
 * 내용 : 9063. 대지
 */
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		int xMin = sc.nextInt();
		int yMin = sc.nextInt();
		
		int xMax = xMin;
		int yMax = yMin;
		
		
		for(int i=1 ; i<tc ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x < xMin) {
				xMin = x;
			}else if(x > xMax) {
				xMax = x;
			}
			
			if(y < yMin) {
				yMin = y;
			}else if(y > yMax) {
				yMax = y;
			}
		}
		
		int width  = xMax - xMin;
		int height = yMax - yMin;
		
		System.out.print(width * height);
		
		sc.close();
	}
}