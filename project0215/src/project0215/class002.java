package project0215;

public class class002 {

	public static void main(String[] args) {
		/*	�������迭
					�迭�� ������ 2�� �̻��� �迭
		1. ����
			1) �迭�� ũ�⸦ ó������ ����
				�ڷ��� [][] �迭�̸� = new �ڷ��� [����][����];
			2) �迭�� ù��° ���� ũ�⸸ �����ϰ� ���߿� �ι�° ������ ũ�⸦ ����
				�ڷ��� [][] �迭�̸� = new �ڷ��� [����][];
				�迭�̸�[0]=new�ڷ���[����];
				�迭�̸�[1]=new�ڷ���[����];
					->�������� ������ �������� ���� ��.
			3) �ʱ� �����͸� ������ ���� ��
				�ڷ��� [][] �迭�̸� = {{�����ͳ���},{�����ͳ���},{�����ͳ���},.....}
		2. length
			������ �ε����� �����Դϴ�.
			...
			int[]ar=new int [5];
			ar.length=5
		  int [][] br = new int [4][3];
		    br.length = 4
		    br[0].length=3
		 */
		
		int [][] ar = new int[4][3];
		System.out.printf("%d\n",ar.length);
		System.out.printf("%d\n", ar[0].length);
		System.out.printf("%d\n", ar[3].length);
	
		System.out.printf("---------------------------\n");
		
		int [][] br = {{10,30,28},{15,70,34},{23,15,26},{54,60,41}};
		int x= br.length;
		int y=br[0].length;

		for(int i=0;i<x;i=i+1) {
			for(int j=0;j<y;j=j+1) {
				System.out.printf("%d\n", br[i][j]);
			}
		}
		
		System.out.printf("---------------------------\n");
		for(int [] temp : br) {
			for(int imsi : temp) {
				System.out.printf("%d ",imsi);
			}
			System.out.printf("\n");
		}
		
		String [][] person = {{"������","�ȿ���"},{"������","���߱�"}};
		System.out.printf("%s", person[0][1]);
		
		/*
		 * 
		 * 
		 */
		
		
		
		
		
	
	}

}
