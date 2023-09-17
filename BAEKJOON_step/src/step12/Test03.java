package step12;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/24
 * 이름 : 한상민
 * 내용 : 19532. 수학은 비대면강의입니다.
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력받기
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		
		// 연립방정식 풀기
		double x=0, y=0;
		
		if(a==0 && e==0) {
			x = f/d; 
			y = c/b;
			
		}else if(b==0 && d==0) {
			x = c/a;
			y = f/e;
			
		}else if(a==0) {
			x = (f - c*e/b)/d;
			y = c/b;
			
		}else if(b==0) { 
			x = c/a;
			y = (f - c*d/a)/e;
			
		}else if(d==0) { 
			x = (c - b*f/e)/a;
			y = f/e;
			
		}else if(e==0) { 
			x = f/d;
			y = (c - a*f/d)/b;
			
		}else { // ~~ a, b, d, e 모두 0이 아닐 때
			x = (c*e - b*f) / (a*e - b*d);
			y = (c*d - a*f) / (b*d - a*e);
		}
		
		sc.close();
		
		System.out.println((int) x + " " + (int) y);
	}
}
