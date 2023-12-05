package step09;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/10
 * 이름 : 한상민
 * 내용 : 5086. 배수와 약수
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 && b==0) {
				break;
			}
			
			if(b%a==0) {
				System.out.println("factor");
			}else if(a%b==0) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");
			}
		}
		
		sc.close(); 
	}
}
