package step13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/31
 * 이름 : 한상민
 * 내용 : 2751. 수 정렬하기2
 * 
 * 참조
 *  - 시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 수 있습니다. 
 *  	예를 들면 병합 정렬, 힙 정렬 등이 있지만, 어려운 알고리즘이므로 
 *  	지금은 언어에 내장된 정렬 함수를 쓰는 것을 추천드립니다.
 * 
 * 참고
 *  - https://st-lab.tistory.com/106
 *  - https://st-lab.tistory.com/104?category=856997
 *  
 *  - StringBuilder를 사용하여 문자열을 만들고 한번에 출력할 것.
 */
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0 ; i<n ; i++) {
			list.add(sc.nextInt());
		}
		
		sc.close();
		
		Collections.sort(list);
		
		for(int num : list) {
			sb.append(num).append("\n");
		}
		System.out.println(sb);
	}
}