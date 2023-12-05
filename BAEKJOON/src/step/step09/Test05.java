package step09;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/13
 * 이름 : 한상민
 * 내용 : 2581. 소수
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		
		//대소구분 (~> 큰수가 n으로)
		if(m > n) {
			int temp = m;
			m = n;
			n = temp;
		}
		
		//소수찾기
		int count = 0;
		int sum = 0;
		int min = 0;
		for(int i=m ; i<=n ; i++) { //m부터 n까지 호출
			
			int tempCount = 0;
			
			for(int j=1 ; j<i ; j++) {
				if(i%j == 0) {
					tempCount++;
				}
			}
			
			if(tempCount == 1) {
				count++;
				sum += i;
			}
			
			if(tempCount == 1 && count == 1) {
				min = i;
			}
		}
		in.close();
		
		if(count > 0) {
			System.out.println(sum);
			System.out.println(min);
		}else {
			System.out.println(-1);
		}
	}
}
