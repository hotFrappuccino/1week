package project0215;

public class practice001 {

	public static void main(String[] args) {
		
		//�迭�� ���� �����ϰ� ���߿� �����͸� ����
		String [] redVelvet = new String[5];
		redVelvet[0] = "���̸�";
		redVelvet[1] = "����";
		redVelvet[2] = "����";
		redVelvet[3] = "����";
		redVelvet[4] = "����";
				
		//�迭�� ��� ���
		System.out.printf("%s\n", redVelvet[0]);
		System.out.printf("%s\n", redVelvet[1]);
		System.out.printf("%s\n", redVelvet[2]);
		System.out.printf("%s\n", redVelvet[3]);
		System.out.printf("%s\n", redVelvet[4]);
		
		System.out.printf("------------------\n");
		//�̰� �ݺ������� ��ġ��
			//.�� ��ġ�ĸ� 1.�ڵ��� ���� ���� ���̰� 2.�ϳ��� �������� ó���ϸ� ���߿� ���� �� ���������� ����
		int i=0;
		while(i<5) {
			System.out.printf("%s\n", redVelvet[i]);
			i=i+1;
		}

		System.out.printf("------------------\n");
		//�迭�� ������ ������ ����� �����ϸ� ���߿� �����Ͱ� �ٲ���� �� ������ ����ϱ� .length�� ���
		i=0;
		while(i<redVelvet.length) {
			System.out.printf("%s\n", redVelvet[i]);
			i=i+1;
		}
		System.out.printf("------------------\n");
		//������ ������ ���������� .length�� ������ �̵���θ� �ø��� ���� �ſ� ��ȿ����.
		//�ݺ��� �ȿ��� ������ �����͸� �����ϴ� ��� �� �����Ͱ� heap�� ����� �����Ͷ�� ����� ������ �Űܳ��� ����ϴ� ���� ȿ����.
		i=0;
		int x=redVelvet.length;
		while(i<x) {
			System.out.printf("%s\n", redVelvet[i]);
			i=i+1;
		}
		System.out.printf("------------------\n");
		//���� ���Ÿ� �̿��� �迭�� ������ ���. for(������ ���� : �迭 ){������ ����} _��� ������ιۿ� ����
		for(String temp : redVelvet) {
			System.out.printf("%s\n", temp);
		}
	
		
	
	}

}
