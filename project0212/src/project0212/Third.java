package project0212;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		byte b1 = 10;
		byte b2 = 20;
		//int���� ���� ũ�� �����ͳ��� ������ �ϸ� int�� �����ؼ� ������ ����.
		//�׷��� ���� ����� byte�� ������ �� ����!!
		//ex) byte result = b1 + b2
		int result = b1+b2;
		System.out.println(result);
		
		int x = 100;
		//ǥ�������� ū �����ʹ� ���� ǥ�������� ������ ������ ���� ����.��
		// �̷� �� ������ �����ϱ� ���� int���� ������ ���Ѽ� ����
		// �� ��� �����ͼսǿ� �����ؾ� �մϴ�.
		//byte b = x;
		
		//x�� byte�� �����ؼ� b�� ����
		byte b =(byte)x;
		System.out.println("b:"+ b);
		x=200;
		b=(byte)x;
		System.out.println("b:"+b);
		
		
		//�Ǽ��� ������ ��������ȯ�ϸ� �Ҽ��� ������.
		double d = 3.84;
		//�Ǽ��� ������ �����ϱ� ���ؼ��� ������ ���������ͷ� �����ؾ� ��.
		x= (int)d;
		System.out.println("x:"+x);
		
		int n1 = 15;
		int n2 = 2;
		//���� ǥ������ ���� �����͸� ū ǥ�������� �����ͷ� �����ϴ� ������ ���ϴ� ����� ��� ���ؼ� �Դϴ�.
		double r = (double)n1/n2; //double�ϰ� int�� ����ϸ� double�� �����ϱ� �� �߿� �ϳ��� double���̾ ��.
		System.out.println("r:"+r);
		
		double su = 5.6;
		//���� ���ڸ� �Ҽ� ù°�ڸ����� �ݿø��ؼ� ���
		//5.6�̸� 6����, 5.4�̸� 5�� ���
		
		int h;
		h = (int)(su+0.5);
		System.out.println("h:"+h);
		su = 5.4;
		h = (int)(su+0.5);
		System.out.println("h:"+h);
		

		su = 5.46;
		//���� ���ڸ� �Ҽ� ��°�ڸ����� �ݿø��ؼ� ���
		//5.46�̸� 5.5����, 5.44�̸� 5.4�� ���
		
		su=su*10;
		h = (int)(su+0.5);
		su=h/10.0;
		System.out.println("su:"+su);
		
		su = 5.44;
		su=su*10;
		h = (int)(su+0.5);
		su=h/10.0;
		System.out.println("su:"+su);
	}

}
