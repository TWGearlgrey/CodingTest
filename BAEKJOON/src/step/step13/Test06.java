package step13;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜 : 2023/08/07
 * 이름 : 한상민
 * 내용 : 1427. 소트인사이드
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();
		
		int[] arr = new int[n.length()];
		
		for(int i=0 ; i<n.length() ; i++) {
			arr[i] = (int) n.charAt(i) -'0';
		}
		
		Arrays.sort(arr);
		
		for(int i=n.length()-1 ; i>=0 ; i--) {
			System.out.print(arr[i]);
		}
	}
}
