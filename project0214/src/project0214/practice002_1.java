package project0214;

public class practice002_1 {

	public static void main(String[] args) {
		/*
		 2*1=2
		 2*2=4
		 ...
		 2*9=18
		 */
		int i;
		for(i=0;i<9;i=i+1) {
			System.out.printf(" 2*%d= %3d\n", i+1,(i+1)*2);
		}
		System.out.printf("\n==============\n");
		i=0;
		while(i<9) {
			i=i+1;
			System.out.printf(" 2*%d= %3d\n", i,i*2);
		}
		
		System.out.printf("\n==============\n");
		
		i=0;
		do{
			System.out.printf(" 2*%d= %3d\n", i+1,(i+1)*2);
			i=i+1;
		} while(i<9);
		System.out.printf("\n==============1���� 10������ �հ�\n");
		
		
		//1���� 10������ �հ踦 ���غ��ô�.
		i=1;
		int sum=0;
		while(i<11) {
			sum = sum +i;
			i=i+1;
		}
		System.out.printf("�հ�:%d\n",sum);
		
		//1���� 10���� ���� �߿��� ¦���� ��
		
		i=0;
		sum=0;
		while(i<11) {
			sum = sum +i;
			i=i+2;
		}
		System.out.printf("¦���� ��:%d\n",sum);
		
		//1���� 10������ ����� �Ҽ� ù°�ڸ����� ���ؼ� ���.
		i=1;
		sum=0;
		while(i<11) {
			sum = sum +i;
			i=i+1;
		}	
		double avg = (double) sum / 10;
		System.out.printf("���:%f\n",avg);
		
	}

}
