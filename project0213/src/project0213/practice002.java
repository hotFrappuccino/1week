package project0213;

import java.util.Scanner;

public class practice002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("�ݾ��� �Է��ϼ��� :");
		int money = sc.nextInt();
		
		int man = money/10000;
		int five = money%10000/5000;
		int chun = money%5000/1000;
		
		System.out.printf("�Ž�����:%d\n",money);
		System.out.printf("���� %d��, ��õ�� %d��, õ�� %d��", man,five,chun);
		sc.close();
	}

}
