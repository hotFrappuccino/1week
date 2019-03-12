package project0213;

import java.util.Scanner;

public class practice002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("금액을 입력하세요 :");
		int money = sc.nextInt();
		
		int man = money/10000;
		int five = money%10000/5000;
		int chun = money%5000/1000;
		
		System.out.printf("거스름돈:%d\n",money);
		System.out.printf("만원 %d장, 오천원 %d장, 천원 %d장", man,five,chun);
		sc.close();
	}

}
