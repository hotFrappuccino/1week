package project0215;

public class class003 {

	public static void main(String[] args) {
		/*
		 ***********�������� ������ ����� �Ͼ�� ��
			������	- �հ�, ���, ����, �ִ밪, �ּҰ�, ǥ������, �л�, �߾Ӱ�, ����.....
			����		- ����, ����, ����.......
							-�ִ�, �ּҰ��� ���͸��Ѵٴ���, �ʹ� �����ȵǴ� �� ���͸��ϴ� ������ �� �ɷ�����.
							
			map�ϰ� filter�� ��� ���α׷��̾ �־��. �װ� ��¥ �� �ʿ��ϴٴ� ��. ����!!
		 */
		
		int [] ar = {40,70,30,65,93,48,87};
		// 60�� �̻��� �������� �հ�, ����, ���(�Ҽ� 2�ڸ����� ���)
		
		//�հ踦 ���� ���� �հ�!��� ������ ���� �� ���� �ʱ⼳����!!���� ����������(���� 0������ �ƴҼ��� ����.)
		
		int sum=0; //�հ�
		int cnt=0; //����
		
		
		for(int x : ar) {
			if(x>=60) {
				sum=sum+x;
				cnt=cnt+1;
			}
		}

		System.out.printf("%d\n",sum);
		System.out.printf("%d\n",  cnt);
		if(cnt != 0) {
			double avg = (double)sum/cnt;
			System.out.printf("%.2f", avg);
		}else {
			System.out.printf("���ǿ� �´� ���� ����.");
		}
		
		System.out.printf("\n-----------------------------\n");
		//�ִ밪 : �ִ밪�� ������ ������ ����� ������ �������� ���� ������ �ʱ⼳��._�迭�� ù��°�� ����.
			//��� ��ҿ� �ִ밪 ������ ���ؼ� ����� ���� �ִ밪���� ũ�ٸ� �ִ밪�� ����� ������ ����.
		int max=0;
		for(int x:ar) {
			if (max<x) {
				max = x;
			} 
		}
		System.out.printf("%d\n", max);

		System.out.printf("\n-----------------------------\n");
		//�ּҰ� : �ּҰ��� ������ ������ ����� ������ ���� �� ���� ū ������ �ʱ⼳��._�迭�� ù��°�� ����.
			//��� ��ҿ� ������ ���ؼ� ����� ���� �ּҰ����� �۸� �ּҰ��� ����� ������ ������
		int min=100;
		for(int x:ar) {
			if (min>x) {
				min = x;
			} 
		}
		System.out.printf("%d\n", min);
		int [] ar1 = {40,70,30,65,93,48,88};
		int[]ar2= {51,73};
		//************2�� �迭�� �����͸� ������ �迭
		int [] merge = new int [ar1.length+ar2.length];	//
		for(int i=0;i<ar1.length;i=i+1) {
			merge[i]=ar1[i];
		}
		//ar2�� ������ merge�� �����ϼ���. �׸��� ���.
		
		for(int i=0;i<ar2.length;i=i+1) {
			merge[i+ar1.length]=ar2[i];
		}
		for(int e:merge) {
			System.out.printf("%d  ", e);
		}

	}
}
