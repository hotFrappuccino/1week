package project0214;

import java.util.Scanner;

public class practice003 {

	public static void main(String[] args) {
		// if / switch / for / while / do~while / break / continue
		// �� ��ߵ���, �� �װ� ������ ����ϰ� �����ϸ鼭 ���ڰ� ���⢽
		
		//�⵵�� �Է¹޾Ƽ� �����̸� "�Է¹��� �⵵�� ����", ������ �ƴϸ� "�Է¹��� �⵵�� ������ �ƴ�"�̶�� ���
				//=>���⼭ ����� �� ������ ���Ĵ� ������ ���� ��ü�� �ľ��ϴ� �� ����� �Ŷ��.
		
		/*
		  1. ���� �Է� -> �״�� ���
		  2. ���� �Ǻ� -> �����̸� true / ���� �ƴϸ� false ���
		  3. ���
		 */

			Scanner sc = new Scanner (System.in);
			System.out.printf("������ �Է��ϼ��� :");
			int year = sc.nextInt();
		
			if(year%4==0 && year%100!=0 || year%400==0) {
				System.out.printf("�Է¹��� �⵵�� ����\n");
			}
			else{
				System.out.printf("�Է¹��� �⵵�� ������ �ƴ�\n");
			}
			
			sc.close();

		
		
	}
}
