package project0214;

import java.util.Scanner;

public class practice004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 �̻��� ������ �Է� �޾Ƽ� �Ҽ�(Prime) �Ǻ�
		// �Ҽ� : 1�� �ڱ� �ڽ����θ� ���������� �� _ 2���� �ڱ� �ڽ��� ������ �Ǵ� ���ڱ��� ������ �������� ������ �Ҽ�.
		/*
		 * flag!!!! boolean f = false; for(){ if(����){ f= true; break;}} } ���⼭ f�� false��
		 * ������ �������� ���� ��(if���� ���� ���� ��.) f�� true�� ������ ������ ��(if���� ���� ���� ��) int x;
		 * for(x=0;x<y;x=x+1){ if(����){break;)} } ���⼭ x==y�̸� ������ ���� �Ŵϱ� �� �� �� ������. x!=y�̸�
		 * ������ ���� �Ŵϱ� �ٽ� �ض� ������� �� �̾�.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.printf("���ڸ� �Է��ϼ��� : ");
		int su = sc.nextInt();

		int i;
		for (i = 2; i <= su / 2; i = i + 1) {
			if (su % i == 0) {
				break;
			}
		}

		if (i == su / 2 + 1) {
			System.out.printf("�Ҽ��Դϴ�.\n");
		} else {
			System.out.printf("�Ҽ��� �ƴմϴ�.\n");
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
			System.out.printf("�Ҽ�");
		} else {
			System.out.printf("�Ҽ��ƴ�.");
		}
	}

}
