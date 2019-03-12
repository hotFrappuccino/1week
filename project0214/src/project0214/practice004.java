package project0214;

import java.util.Scanner;

public class practice004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 이상의 정수를 입력 받아서 소수(Prime) 판별
		// 소수 : 1과 자기 자신으로만 나누어지는 수 _ 2부터 자기 자신의 절반이 되는 숫자까지 나누어 떨어지지 않으면 소수.
		/*
		 * flag!!!! boolean f = false; for(){ if(조건){ f= true; break;}} } 여기서 f가 false면
		 * 조건을 만족하지 못한 것(if문에 들어가지 못한 거.) f가 true면 조건을 만족한 것(if문에 들어갔다 나온 것) int x;
		 * for(x=0;x<y;x=x+1){ if(조건){break;)} } 여기서 x==y이면 끝까지 돌린 거니까 다 돈 거 오케이. x!=y이면
		 * 끝까지 못한 거니까 다시 해라 명령해줄 수 이씀.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요 : ");
		int su = sc.nextInt();

		int i;
		for (i = 2; i <= su / 2; i = i + 1) {
			if (su % i == 0) {
				break;
			}
		}

		if (i == su / 2 + 1) {
			System.out.printf("소수입니다.\n");
		} else {
			System.out.printf("소수가 아닙니다.\n");
		}
		System.out.printf("============================flag===========\n");

		boolean flag = false;
		for (i = 2; i <= su / 2; i = i + 1) {
			if (su % i == 0) {
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.printf("소수");
		} else {
			System.out.printf("소수아님.");
		}
	}

}
