package project0215;

public class practice003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar1 = {40,70,30,65,93,48,88};
		int[]ar2= {51,73,80,90,11};
		
		//�� �迭 ��ġ��
		int[] merge = new int [ar1.length+ar2.length];
		for(int i=0;i<ar1.length;i=i+1) {
			merge[i]=ar1[i];
		}
		for(int i=0;i<ar2.length;i=i+1) {
			merge[i+ar1.length]=ar2[i];
		}
		for(int x:merge) {
			System.out.printf("%d ", x);
		}
		System.out.printf("\n");
		
		//60�� �Ѵ� �������� ����, ����, ���
		int sum=0;
		int cnt=0;
		
		for(int data: merge) {
			if(data>=60) {
				sum=sum+data;
				cnt=cnt+1;
			}
		}
		System.out.printf("�հ� : %d\n", sum);
		System.out.printf("���� : %d\n", cnt);
		
		if(cnt!=0) {
			double avg =(double)sum/cnt;
			System.out.printf("��� : %.2f\n",avg);
		} else {
			System.out.printf("�ش� ���� �������� �ʽ��ϴ�.\n");
		}
		//�ִ밪�� �ּҰ�
		int max=0;
		int min=100;
		for(int data : merge) {
			if(max<data) {
				max=data;
			}
		}
		for(int data : merge) {
			if(min>data) {
				min=data;
			}
		}
		
		System.out.printf("�ִ밪 : %d\n", max);
		System.out.printf("�ּҰ�: %d\n", min);
		
	}

}
