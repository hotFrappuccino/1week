package project0213;

import java.util.Scanner;

public class practice003 {

	public static void main(String[] args) {
		//�ϳ��� ����(int)�� �Է¹޾� �����ϴ� ������ �ۼ�
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("������ �Է��ϼ��� : \n");
		int score = sc.nextInt();
		
		//score�� 60�� �̻��̸� �հ��̶�� ��� - if�� �̿��Ͽ� �ۼ�
		System.out.printf("if�� �ִ� ���\n=======");
		if(score>=60) {
			System.out.printf("�հ�\n");
		}
		
		//score�� 60�� �̻��̸� �հ� �׷��� ������ ���հ��̶�� ���
		System.out.printf("if�� else �ִ� ���\n=========");
		if(score>=60) {
			System.out.printf("�հ�\n");
		}
		else {
			System.out.printf("���հ�\n");
		}
		
		//score�� 90~100�̸� ��, 80~90�̸��̸� ��, 70~80�̸��̸� ��, 60~70�̸��̸� ��, 0~60�̸��̸� �� ��� ���
		System.out.printf("else if���� �ִ� ��� \n========");
		if(score>=90 && score<=100) {
			System.out.printf("��\n");
		}
		else if(score>=80 && score<90) {
			System.out.printf("��\n");
		}
		else if(score>=70 && score<80) {
			System.out.printf("��\n");
		}
		else if(score>=60 && score<70) {
			System.out.printf("��\n");
		}
		else if(score>=0 && score<60) {
			System.out.printf("��\n");
		}
		else {
			System.out.printf("�߸��� ������ �Է��ϼ̽��ϴ�.\n");
		}
		//if�� else if�� �����ִ� ��쿡 else�� �������� ��Ȳ �߻��� ó���մϴ�.
		sc.close();
		
		
	}

}
