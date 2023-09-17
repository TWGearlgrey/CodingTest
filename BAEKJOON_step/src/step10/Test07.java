package step10;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/17
 * 이름 : 한상민
 * 내용 : 5073. 삼각형과 세 변
 */
public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			// 0 0 0 입력시 종료
			if(x+y+z ==0) {
				break;
			}
			
			// 삼각형 종류에 따라 분류
			if(x >= y+z || y >= x+z || z >= x+y) {
				System.out.println("Invalid");
			}else if(x == y && y == z) {
				System.out.println("Equilateral");
				
			}else if(x==y || y==z || x==z) {
				System.out.println("Isosceles");
			
			}else {
				System.out.println("Scalene");
			}
			
		}
		
		sc.close();
	}
}
