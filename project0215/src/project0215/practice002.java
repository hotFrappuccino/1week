package project0215;

public class practice002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �ٲ�� �� ����, ���߿� �ٲ�� �� �ٱ���
		
		for(int i=1;i<=9;i=i+1) {
			for(int j=2;j<=9;j=j+1) {
				System.out.printf("%2d * %2d = %2d  ",j,i,j*i);
			}
			System.out.printf("\n");
		}
		
		//��� ���� ũ�Ⱑ ������ 2���� �迭
		//��� �̸� 20���� 5�� �׷��� ������ �� �ִ� �迭�� �����ض�.
		String [][] person = new String[5][20];
		
		//���� ũ�Ⱑ �ٸ� 2���� �迭
		//�л����� ����(����)��ù��° �׷��� 28��, �ι�° �׷��� 33��, 3��° �׷��� 31�� ������ �� �ִ� �迭
		int [][] score = new int[3][];
		score[0]=new int[28];
		score[1]=new int[33];
		score[2]=new int[31];
		
		System.out.printf("%d\n",score.length);  //3
		System.out.printf("%d\n",score[0].length); //28
	//	System.out.printf("%d\n",score[0][0].length);  //is not a field
		System.out.printf("%s\n", score);	//��� �ּҸ� ����. �׷��� ������ �����ڵ�
		System.out.printf("%s\n", score[0]);	//�굵 �ּ� �̾Ƽ� �����ڵ�(d �ȵȴٰ�)
		System.out.printf("%d\n", score[0][0]);
		
		
		//�ʱ� �����͸� ������ 2���� �迭�� ����
		String [][] play = {{"�̺ҹ�","�ٽú�","����"},{"�����̽�","�̽��������÷�","����ġ"},{"���̿���","�޸���","����"}};
		//������ ����ϴ� ���
		int rowSize = play.length;
		for(int i=0;i<3;i=i+1) {
			int colSize = play[i].length;
			for(int j=0;j<3;j=j+1) {
				System.out.printf("%s  ", play[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		
		for(String bangtal[] : play) {
			for(String masterkey : bangtal) {
				System.out.printf("%s  ",masterkey);
			}
			System.out.printf("\n");
		}
	}

}
