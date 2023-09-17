package step13;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 날짜 : 2023/08/09
 * 이름 : 한상민
 * 내용 : 11650. 좌표 정렬하기
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i=0 ; i<n ; i++ ) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] fst, int[] scd) {
				if(fst[0] == scd[0]) {
					return fst[1] - scd[1];
				}else {
					return fst[0] - scd[0];
				}
			}
		});
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0 ; i>n ; i++) {
			result.append(arr[i][0]).append(" ").append(arr[i][0]).append("\n");
		}
		
		System.out.println(result.toString());
	}
}
