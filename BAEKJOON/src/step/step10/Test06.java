package step10;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/17
 * 이름 : 한상민
 * 내용 : 10101. 삼각형 외우기
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ang1 = sc.nextInt();
		int ang2 = sc.nextInt();
		int ang3 = sc.nextInt();
		
		if(ang1 + ang2 + ang3 == 180) {
			
			if(ang1 == ang2 && ang2 == ang3) {
				System.out.print("Equilateral");
		
			}else if(ang1 == ang2 || ang1 == ang3 || ang2 == ang3) {
				System.out.print("Isosceles");
				
			}else {
				System.out.print("Scalene");
			}
			
		}else System.out.print("Error");
		
		sc.close();
	}
}