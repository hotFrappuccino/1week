package project0214;

import java.util.Scanner;

public class practice001 {

	public static void main(String[] args) {
			//�Է��ϴ� �����͸� ���� ��� ���ڿ��� ����
			//��Ʈ��, �߱�, �Ϻ�, �ѱ����� ����
			final String VETNAM = "��Ʈ��";
			final String CHINA = "�߱�";
			final String JAPAN = "�Ϻ�";
			final String KOREA = "�ѱ�";
				//�̷��� ����� ���� �۾��ϸ� �Ʒ� ���̽� �̸��� ���� ���� �������� �бⰡ ������
			Scanner sc = new Scanner(System.in);
			System.out.printf("�޴� �Է�(��Ʈ��/�߱�/�Ϻ�/�ѱ�) :");
			String menu = sc.nextLine(); //menu ������ int�̸� string�� �Է¹��� �� ����. �װ� ����ϱ�!
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
			}		//�Է��� ���ڷ� �ްڴ� �ϰ� ���ڿ��� ������ �����߻�. �Է��� ���ڿ��� ������ ���ڰ� �Էµǵ� default�� ó���س� �� ����.
			sc.close();

	}

}


