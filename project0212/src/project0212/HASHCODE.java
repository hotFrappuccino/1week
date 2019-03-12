package project0212;

public class HASHCODE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 ***���ڿ� ����
		 ���ڿ��� 0�� �̻��� ��������
		 ���ͷ��� �ۼ��� ���� ""�ȿ� ���ϴ� ���������� �׳� �ۼ��ϸ� �˴ϴ�.
		 ������ �����ϰ� ���� ���� String�̶�� �ڷ����� ���
		 
		 String name ="�ڹ���";
		
		 true�� false : boolean
		 ���� - ���� : byte, short, char, int, long
		      �Ǽ� : float, double
		���ڿ� - string
		 */
		
		/*
		 ***Literal ����
		 Literal�� �� ó�� ���� �� ��� pool�� �����ϰ� �������ʹ� �����ؼ� ����մϴ�.
		 System.identityHashCode(������)�� ȣ���ϸ� �����Ͱ� ���� ����� ���� �ڵ尪�� �� �� �ֽ��ϴ�.
		 �� �ڵ尪�� �����ϴٸ� ������ ��ġ�� �����͸� �����ϰ� �ִٴ� �� Ȯ��
		 */
		System.out.println("=====================�ؽ��ڵ� Ȯ��===================");
		int �� = 10;
		int �� = 10;
		int �� = 11;
		long �� = 11L;
		
		System.out.println("��:" + System.identityHashCode(��));
		System.out.println("��:" + System.identityHashCode(��));
		System.out.println("��:" + System.identityHashCode(��));
		System.out.println("��:" + System.identityHashCode(��));
		
		//a,b�� ���� ���� ����Ű�Ƿ� ���� �ڵ�.
		//c�� ���� �޶� �ٸ��ڵ�
		//c�� d�� ���� ������ �ڷ����� �޶� �ٸ� �ڵ�.
		
		System.out.println("=====================System.out.printf===================");
		/*
		***System.out.printf
		 ������ �����ؼ� �����͸� �ֿܼ� ����ϴ� �޼ҵ�
		 ������ %�� �����մϴ�.
		 ������ ������ �� �����͸� ���ν�Ű�� ������ ����մϴ�.
		 
		 System.out.printf("�޽��� %����...",������ ����...)
		 ���� �ϳ��� �ڿ� ������ �����Ͱ� �ϳ��� ���εǼ� ��µ˴ϴ�.
		 */
		 /*
		 ���� ���� : %d,
		        %����d - ���ڸ�ŭ �ڸ��� Ȯ���� �� �����͸� ���.
		                           Ȯ���� �ڸ����� ������ �ڸ����� ũ�� ���� ��ü�� ����մϴ�.
				%0����d - ���� �ڸ��� 0���� ä��
				%-����d - ���ʸ���
		 */
		int aa = 10;
		System.out.printf("aa:%d\n",aa);	//a:10
		System.out.printf("aa:%7d\n",aa);	//a:     10
		System.out.printf("aa:%1d\n",aa);	//a:10
		System.out.printf("aa:%07d\n",aa);	//a:0000010
		System.out.printf("aa:%-7d\n",aa);	//a:10
		
		/*
		�Ǽ����� : %f : �Ҽ� 6�ڸ� ���
				%��ü�ڸ���.�Ҽ��ڸ���f : �ڸ��� ���Ͽ��� �ݿø�
				%.�Ҽ��ڸ���f : �ڸ��� ���Ͽ��� �ݿø�
				%g : ������ �״��
				%e : ����ǥ������� ���
		 */
		double dd = 12.765478;
		System.out.printf("dd:%.4f\n",dd);	//d:12.7655
		
		/*
		���� ���� : %c
		���ڿ���  : %s
		boolean : %b, %B   - b�� �ҹ��ڷ� true, B�� �빮�ڷ� TRUE
		 */
		System.out.println("=====================�ǽ�===================");
		int a = 8;
		int b = 197;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------------------------------");
		//5�ڸ��� a�� ����ϰ� ���� �ڸ��� 0���� ä���
		System.out.printf("%05d\n", a);
		System.out.printf("%05d\n", b);
		
		System.out.println("-----------------------------------");
		double d = 3.26566172;
		System.out.println(d);
		//�Ҽ� 3°�ڸ����� ��� - 4��° �ڸ����� �ݿø�
		System.out.printf("%.3f", d);
		
	}

}
