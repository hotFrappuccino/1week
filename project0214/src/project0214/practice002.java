package project0214;

public class practice002 {

	public static void main(String[] args) {

		System.out.printf("====================Hello JAVA 3�� ���_���� ����\n");
		//Hello JAVA�� 3�� ���
		System.out.printf("Hello JAVA\n");
		System.out.printf("Hello JAVA\n");
		System.out.printf("Hello JAVA\n");
		
		
		System.out.printf("====================Hello JAVA 3�� ���_for �̿�\n");
		int i;
		for(i=0;i<3;i=i+1){
		System.out.printf("Hello JAVA\n");
		}
		
		//�ΰ��� ���� ����, ������ ���� �� ����. ������ ���⼭ ��Ʈ�� �ٲٶ�� �ϸ� �Ʒ��� �ξ� ����. �׷��� �̷��� ���ڴ� ����. ����?
		
		
		System.out.printf("====================for ��� _0~2���� ������� ���\n");
		//0~2���� ������� ���
		for(i=0; i<3;i=i+1) {
			System.out.printf("i=%d\n", i);
		}
		System.out.printf("====================for ���_1,2,3�� ���\n");
		//1,2,3�� ���
		for(i=0; i<3;i=i+1) {
			System.out.printf("i=%d\n", i+1);
		}

		System.out.printf("====================for ���_0,2,4�� ���\n");
		//0,2,4�� ���
		for(i=0; i<3;i=i+1) {
			System.out.printf("i=%d\n", i*2);
		}
	
		for(i=0; i<6;i=i+1) {
			System.out.printf("i=%d\n", 1<<i);
		}
		
		System.out.printf("===================while ���\n");
		
		i=0;		//for���� 1�� ǥ������ �Ǵ� �κ�
		while(i<3) {	//for���� 2�� ǥ���� �ڸ��� ������ boolean�� ��µǴ� ��
			System.out.printf("i=%d\n",i);
			i=i+1;		//for���� 3�� ǥ������ �Ǵ� �κ�
		}

		System.out.printf("===================do~while ���\n");
		
		i=0;		//for���� 1�� ǥ������ �Ǵ� �κ�
		do{
			System.out.printf("i=%d\n",i);
			i=i+1;		//for���� 3�� ǥ������ �Ǵ� �κ�
		}while(i<3); //; ���߸��� �ʵ��� ����
	}

}
