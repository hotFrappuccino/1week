package project0213;

import java.util.Scanner;

public class class005 {

	public static void main(String[] args) {
		
		/*
		 Ű����κ��� �Է¹ޱ�
		 java.util.Scanner Ŭ������ �̿��ϸ� Ű����κ��� �Է��� ���� �� �ֽ��ϴ�.
		 Scanner ������ = new Scanner (System.in);
		 
		 �Է¹��� ������ ������ ������ = ������.nextInt()
		 ������ �Է¹��� ���� nextInt()
		 �Ǽ��� �Է¹��� ���� nextDouble()
		 �Ҹ��� �Է¹��� ���� nextBoolean()
		 ���ڿ��� �Է¹ް��� �� ���� nextLine()
		 */
		
		
		//�������� �� �̰� ��ߵǴ��� �����ϰ� ����ϸ鼭 �ڵ��սô�//
		Scanner sc = new Scanner(System.in);
		System.out.printf("�������Է��ϼ���:"); //�׳� ��ũ ���¿��� �Է��϶���� ��¼���� �˰ھ�? ����.
		int r = sc.nextInt();
		System.out.printf("���� : %d\n", r);
		
		System.out.printf("�̸����Է��ϼ���:");
		sc.nextLine();						//���� �Է��ϰ� ���� enter�� �̰ɷ� ó���϶�� ���� ��. �굵 �� �־��ֱ�.
		String name = sc.nextLine();
		System.out.printf("�̸� : %s\n", name);
		

	}

}
