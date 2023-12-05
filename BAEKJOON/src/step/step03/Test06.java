package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜 : 2023/06/21
 * 이름 : 한상민
 * 내용 : 15552번. 빠른 A+B
 * 힌트 : Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용
 * 
 * BufferedReader 단점
 *  - IOException의 예외처리가 필수
 *  - 입력받은 모든 데이터가 String으로 반환
 *  - 줄마ㅏ다 입력받아서, 따로 split하여 데이터를 처리해주어야 한다.
 *  - 숫자형식으로 받기 위해서는 형 변환이 필요
 *  	: Scanner의 nextInt()로 받으면 [1, 2, 3]을 차례로 받지만
 *  		Buffered의 readLine()으로 받으면 "1 2 3"이라는 문자열 자체로 받으며
 *  		split(' '로 띄어쓰기를 구분하는 Integer.parseInt() 과정이 필요해진다.
 */
public class Test06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0 ; i < T ; i++) {
			String s = br.readLine();
			int A = Integer.parseInt(s.split(" ")[0]);
			int B = Integer.parseInt(s.split(" ")[1]); //배열형태이므로 인덱스를 가리켜야함.

			bw.write(A+B+"\n"); // bw.newLine(); 을 사용했더니 유니코드가 출력 됨. 왜?
		}

		bw.flush(); // 화면에 출력하는 역할. for문안에 작성시, Sysout 기능과 다를게 없어짐.
		br.close();
		bw.close();
	}
}