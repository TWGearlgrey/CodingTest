package step06;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/05
 * 이름 : 한상민
 * 내용 : 1316. 그룹 단어 체커
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 테스트 케이스 n 입력
		int n = in.nextInt();
		
		// 그룹단어 카운트 생성
		int count = n;

		// n만큼 문자열 입력
		for(int i=0 ; i<n ; i++) {
			String str = in.next();
			int len = str.length();
			
		/** 
		 *  문자열의 인덱스 j에 있는 첫 인덱스 start와 
		 * 그 문자가 마지막에 등장하는 인덱스 end를 구하여
		 * 인덱스 start와 end 사이에서 값을 비교.
		 *  
		 *  다른 값이 나올시 안쪽에 있는 반복문을 중단하고 카운트.
		 * 그 후 다시 문자열을 입력받아 검사한다.
		 */
			// 입력받은 문자열에서 확인할 문자열의 구간을 구함
			outer: for(int j=0 ; j<len ; j++) {
				int start = str.indexOf(String.valueOf(str.charAt(j)));
				int end = str.lastIndexOf(String.valueOf(str.charAt(j)));
				
				// 그 구간에서 문자열 비교하여 카운트
				for(int k=start ; k<=end ; k++) {
					if (String.valueOf(str.charAt(k))
							.equals(String.valueOf(str.charAt(end)))) {
						continue;
					} else {
						count--;
						break outer;
					}
				}
			}
		}
		System.out.println(count);
	
		in.close();
	}
}