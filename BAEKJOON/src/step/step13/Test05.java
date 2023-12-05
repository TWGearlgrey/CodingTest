package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2023/08/07
 * 이름 : 한상민
 * 내용 : 10989. 수 정렬하기 3
 */
public class Test05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] cnt = new int [10001];
		
		// 1번 과정
		for(int i=0; i<n ; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		// 카운팅 --; 하며 출력 buffer
		for(int i=0 ; i<10001 ; i++) {
			while(cnt[i] > 0) {
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		
        // 출력
		System.out.println(sb);
	}
}