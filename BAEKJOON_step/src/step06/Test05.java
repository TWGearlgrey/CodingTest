package step06;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/04
 * 이름 : 한상민
 * 내용 : 1157. 단어공부
 */
public class Test05 {
	public static void main(String[] args) {
		
		// 단어 입력 및 단어 길이
		Scanner in = new Scanner(System.in);
		String word = in.next();
		
		// 단어 대문자로 변환
		char[] tw = new char[word.length()];
		for(int i=0 ; i<word.length() ; i++) {
			if(word.charAt(i)>90) {
				tw[i] = (char) (word.charAt(i) - 32);
			} else {
				tw[i] = word.charAt(i);
			}
		}
		
		// 알파벳 순서(1~26)을 카운트할 배열생성
		int[] counts = new int[26];
		for(int i=0 ; i<26 ; i++) {
			counts[i] = 0;
		}
		
		// A~Z 배열 생성
		char[] bigAlp = new char[26];
		for(int i=0 ; i<26 ; i++) {
			bigAlp[i] = (char) (i + 65);
		}
		
		// 단어의 각자리와 알파벳 대소문자 비교하여 카운트
		for(int i=0 ; i<word.length() ; i++) { 
			for(int j=0 ; j<26 ; j++) {
				if(tw[i] == bigAlp[j]) {
					counts[j]++;
				}
			}
		}
		
		// 카운트한 값 비교하여 출력
		int max = 0;
		char out = 0;
		for(int i=0 ; i<26 ; i++) {
			if (max < counts[i]) {
				max = counts[i];
				out = (char) (i+65);
			}else if (max == counts[i]) {
				out = '?';
			}
		}
		System.out.println(out);
		
		in.close();
	}
}
