package project0214;

import java.util.Scanner;

public class class001 {

	public static void main(String[] args) {
		// Switch : ���� ���� �б�
		/*
		 Switch : ���� ���� �б�
		 	1. ����
		 		switch (ǥ����){
		 				case �� 1 : 
		 						ǥ������ ����� �� 1�� �� ������ ����
		 						(break;)			//�� ���� �� �� ���� �ִ� ����
		 				case ��2 :
		 						ǥ������ ����� ��2�� �� ������ ����
		 						.
		 						.
		 						.
		 				default : ������ ����		_else?
		 						(break;)
		 		cf) ǥ���� : ���� / ����� / ������ �ִ� �Լ� ȣ��
		 	2. ��Ģ
		 		1) ǥ������ ����� ���� �ƴϸ� String _ �Ǽ� �Ұ�! ( ���� ������� ? 2.0 - 1.8 �̶� 0.2 ���� �ʴٰ� �ϴ� ��)
		 								string�� 1.7 ���� �̻���� ��������(����_������� ������ 1.6�� ���
		 		2) default ���� ���� (������ default�� �Ἥ ���ܻ�Ȳ ó���ϴ� ���� ��õ)
		 		3) break�� ������ �� �ִµ�, �����ϸ� fallthrow...(��1�� ������ �극��ũ�ϰ� �� �Ŀ��� �����ߵǴµ� �����ϸ� �Ʒ��� �ൿ���� ���� ��.()
		 		4) ���� �� �� ����� Literal�� ����
		 */
		
		//�޴�(����)�� �Է¹ޱ� ���� ����
		
		final int VETNAM = 1; //������ �ڷ��� �տ� final�� ������ �����͸� ������ �� ���� '���'�� ��.
		final int CHINA = 2;
		final int JAPAN = 3;
		final int KOREA = 4;
			//�̷��� ����� ���� �۾��ϸ� �Ʒ� ���̽� �̸��� ���� ���� �������� �бⰡ ������
		Scanner sc = new Scanner(System.in);
		System.out.printf("�޴� �Է�(1~4) :");
		int menu = sc.nextInt();
		switch (menu){
			case VETNAM : System.out.printf("�ұ���\n");
				break;
			case CHINA : System.out.printf("��¥��\n");
				break;
			case JAPAN : System.out.printf("�紩���쵿\n");
				break;
			case KOREA : System.out.printf("��ġ����\n");
				break;
			default : System.out.printf("�߸��� �Է��Դϴ�.\n");
				break;
		}
		sc.close();

	}

}
	/* Java���� constant(���)�����
		����� ���� ������ �ʴ� �б� ������ ������
		java������ ������ �ڷ��� �տ� final�� ���̸� ����� �˴ϴ�.
		java�� C������ ����� �̸��� ��� �빮�ڷ� �ϴ� ���� ����
		����� �����ϰ� �̿��ϸ� ����� �б������� �����ϱ� ���� ����ϱ⵵ ������ �ڵ��� �������� ���̱� ���� ����ϴ� ��쵵 ����.
					+) ����� ����ϸ� ���� ���� �ڵ带 �������� �ʰ� �Է¹��� �κ�/������� �κи� �����ص� �����Ƽ� ���� ���������� �����ϴ�.
		*/	