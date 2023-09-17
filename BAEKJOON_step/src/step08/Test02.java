package step08;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/10
 * 이름 : 한상민
 * 내용 : 11005. 진법 변환2
 */
public class Test02 {
	public static void main(String[] args) {
		
		// 1. 숫자 n(10)과 b진수 b 입력
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 60466175
		int b = in.nextInt(); // 36
		
		int mok = n;
		ArrayList<Character> naMo = new ArrayList<>();	 // 나머지는 n%b .. 계속 저장해둬야함
		
		// 2. 몫은 덮어씌우고, 나머지는 List에 차례대로 넣기
		while( mok > 0 ) {
			
			if(mok%b < 10) {
				naMo.add((char) (mok%b + '0'));
			}else { 
				naMo.add((char) (mok%b -10 + 'A'));
			}
			
			mok /= b;
		}
		
		// 3. 리스트 거꾸로 불러오기
		for(int i=naMo.size()-1 ; i>=0 ; i--) {
			System.out.print(naMo.get(i));
		}
		
		in.close();
	}
}
