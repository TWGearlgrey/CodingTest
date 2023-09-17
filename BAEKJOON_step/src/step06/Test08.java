package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2023/07/05
 * 이름 : 한상민
 * 내용 : 25206. 너의 평점은
 */
public class Test08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 등급에 따른 평점
		String[] gradeList  = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
		double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
		
		// 합계 (학점, 전공평점)
		double sumScore = 0;
		double sumMyScore = 0;
		
		// 20개 학점 입력
		for(int i=0 ; i<20 ; i++) {
			String n = br.readLine();
			String[] part = n.split(" ");
			
			// 각 학점 합계 계산
			for(int j=0 ; j<9 ; j++) {
				if(part[2].equals(gradeList[j])) {
					sumScore += Double.parseDouble(part[1]);
					sumMyScore += Double.parseDouble(part[1]) * gradeScore[j];
				}
			}
		}

		// 출력
		System.out.println(sumMyScore/sumScore);
		
		br.close();
	}
}