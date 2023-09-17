package step09;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/11
 * 이름 : 한상민
 * 내용 : 9506. 약수들의 합
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 정수 num 입력, -1입력시 break
			int num = sc.nextInt();
			if(num == -1) {
				break;
			}
			
			// 정수 n의 약수를 담을 배열 / 합을 담을 변수 생성
			ArrayList<Integer> arr = new ArrayList<>();
			int sum = 0;
			
			// 정수 n의 약수 구하기
			for(int i=1 ; i<num ; i++) {
				if(num % i == 0 ) {
					arr.add(i);
					sum += i;
				}
			}
			
			// 완전수인지 검사
			if(num == sum) {
				for(int i=0 ; i<arr.size() ; i++) {
					
					if(i==0) { 
						System.out.print(num + " = ");
					}
					
					System.out.print(arr.get(i));
					
					if(i != arr.size()-1) { 
						System.out.print(" + ");
					}else {
						System.out.print("\n");
					}
				}
			}else {
				System.out.println(num + " is NOT perfect.");
			}
		}
		sc.close();
	}
}
