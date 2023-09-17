package step02;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int d1 = in.nextInt();
		int d2 = in.nextInt();
		int d3 = in.nextInt();
		
		
		//모두 같은 주사위가 나온 경우
		if (d1==d2 && d2==d3) {
			System.out.println(10000 + 1000*d1);
		
		//모두 다른 주사위가 나온 경우
		}else if (d1!=d2 && d2!=d3 && d1!=d3) { /*d1!=d3를 생략했다가 3 6 3을 입력 시 
													600으로 의도와 다른 값이 출력 되었음.*/
	
			int ds[] = {d1, d2, d3};
			
			for (int i=0 ; i<2 ; i++)
				for (int j = i+1 ; j<3 ; j++) {
					if (ds[i] > ds[j]) {
						int temp = ds[j];
						ds[j] = ds[i];
						ds[i] = temp;
					}
				}
			System.out.println(ds[2]*100);
			
		//같은 주사위가 두개 나온 경우	
		}else if (d1 == d2 || d1 == d3) {
			System.out.println(1000 + d1*100);
		}else if (d2 == d1 || d2 == d3) {
			System.out.println(1000 + d2*100);
		}else System.out.println(1000 + d3*100);
		
		in.close();
	}
}
