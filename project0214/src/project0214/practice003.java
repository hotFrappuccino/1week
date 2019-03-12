package project0214;

import java.util.Scanner;

public class practice003 {

	public static void main(String[] args) {
		// if / switch / for / while / do~while / break / continue
		// 뭘 써야될지, 왜 그걸 쓰는지 고민하고 생각하면서 예쁘게 적기♡
		
		//년도를 입력받아서 윤년이면 "입력받은 년도는 윤년", 윤년이 아니면 "입력받은 년도는 윤년이 아님"이라고 출력
				//=>여기서 어려운 건 윤년이 뭐냐는 윤년의 조건 자체를 파악하는 게 어려운 거라고.
		
		/*
		  1. 연도 입력 -> 그대로 출력
		  2. 윤년 판별 -> 윤년이면 true / 윤년 아니면 false 출력
		  3. 출력
		 */

			Scanner sc = new Scanner (System.in);
			System.out.printf("연도를 입력하세요 :");
			int year = sc.nextInt();
		
			if(year%4==0 && year%100!=0 || year%400==0) {
				System.out.printf("입력받은 년도는 윤년\n");
			}
			else{
				System.out.printf("입력받은 년도는 윤년이 아님\n");
			}
			
			sc.close();

		
		
	}
}
