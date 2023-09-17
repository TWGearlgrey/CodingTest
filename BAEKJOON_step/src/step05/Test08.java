package step05;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/27
 * 이름 : 한상민
 * 내용 : 1152. 단어의 개수
 */
public class Test08 {
	public static void main(String[] args) {
		/*
		 * 계획1
		 *  1. 문자열 입력받기
		 *  2. 띄어쓰기+1 이 단어의 개수임을 이용
		 *  3. 배열을 불러들이고 띄어쓰기마다 카운트
		 *  4. 카운트한 수 출력하기
		 * 
		 * 문제점1
		 *  - "The Curious Case of Benjamin Button"라는 문장을 입력 받으면
		 *  문장 자체를 문자열로 받아 들이지 않고, 각 단어를 문자열로 받아들인다.
		 *  
		 * 해결방법1
		 *  - 입력 받는 코드인 'String s = in.next();'에 Line을 추가하여 공백도 받는다.
		 *  'String s = in.nextLine();' 이 코드와 같이 수정하여 해결하였다.
		 *  
		 * 문제점2
		 *  - 문장 앞 뒤로 띄어쓰기가 생기면 그것도 카운트하여 단어로 인식하는 문제가 발생한다.
		 *  
		 * 해결방법2
		 *  - 문장 가장 첫 부분과 마지막 부분의 공백을 제거한다.
		 *  - 또는 가장 앞과 뒤를 조회하여 공백이 있다면 카운트 -1 한다.
		 */
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		int length = s.length();
		int count = 1;
		
		if ( s.charAt(0) == ' ') count = count-1 ;
		if ( s.charAt(length-1) == ' ') count = count-1 ;
		
		for ( int i=0 ; i<length ; i++ ) {
			if ( s.charAt(i) == ' ' ) {
				count++;
			}
		}
		System.out.println(count);
		
		in.close();
	}
}
