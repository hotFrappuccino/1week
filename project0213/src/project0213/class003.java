package project0213;

public class class003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 5;
		//n1�� n2 �� ū �� ã��
		int result = n1>n2 ? n1 : n2;
		System.out.printf("result:%d\n", result);
		
		//������ F �Ǵ� M���� ����
		char gender = 'm';
		//gender�� M �̸� ���ڶ�� ���, F �̸� ���ڶ�� ���
		//���׿����� �̿��ؼ� �ذ�
		String x = gender=='M'?"����":"����"; //��� m�� �ν� ���ؼ� m�� ���ڶ�� ���
		System.out.printf("����:%s\n", x);
		
		x = gender == 'M'||gender=='m' ? "����":"����";
		System.out.printf("����:%s\n", x);
		
		//���������� 0~100������ ���ڸ� �����ϰ�
		//60 �̻��̸� �հ�, �׷��� ������ ���հ��̶�� ���
		
		int score =70;
		String pr = score>=60 ? "�հ�":"���հ�";
		System.out.printf("�հݿ���:%s\n", pr);
		
		//score�� 80 �̻��̸� ���, 60 �̻��̸� ����, �� ���ϴ� ������� ���
		
		pr= score>=80?"���": score>=60? "����":"����";
		System.out.printf("���:%s\n", pr);
	}

}
