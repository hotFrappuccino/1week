package project0214;

public class class003 {

	public static void main(String[] args) {
		/* break�� continue
		break�� switch�� �ݺ��� �ȿ��� ���Ǿ� �ڽ��� �����ϰ� �ִ� ��� �� ���� ����� switch�� �ݺ����� ���������� ��ɾ�
		continue�� �ݺ��� �ȿ��� �ݺ����� �� ���κ����� �̵�
			=>�� �ΰ��� ����� switch���� ���Ǵ� ��츦 �����ϰ� ��κ� if�� ���� ���..
		     ��????
			while(true)�ؼ� ���ѹݺ��ϴٰ� if(� ������ �Ǹ�) ���ߵ��� �� �� �̾�.
		label�� �̿��� break�� continue
			=>�ݺ����� ��ø�Ǽ� ���� ��� break�� continue�� ����� �ݺ����� ������ �˴�...��?
			=>�ݺ����� label�� ����ϸ� break�� continue �ڿ� label�� �ٿ��� label�� �ش��ϴ� �ݺ����� ���� ����.
		 */
		
		System.out.printf("==============break \n");

		for(int i=1;i<=10; i=i+1) {
			//3�� ����� �Ǹ� �ݺ����� ����
			if(i%3==0) {break;}
			System.out.printf("i:%d\n",i);
		}
		
		
		System.out.printf("==============continue \n");

		for(int i=1;i<=10; i=i+1) {
			//3�� ����� �Ǹ� �ݺ����� ���� X
			if(i%3==0) {continue;}
			System.out.printf("i:%d\n",i);
		}
		
		//break�� �ݺ� ��ü�� ���� �ϰ� continue�� �� ������ �ݺ��� ������ �ʴ� �װ�. RGRG?

		for(int i=0;i<3;i=i+1) {
			System.out.printf("ù��° �ݺ���\n");
			for(int j=0;j<3;j=j+1) {
				System.out.printf("�ι�° �ݺ���\n");
				break; //break�� ���� ����� switch�� �ݺ����� ������ �ݴϴ�.(�� ��� �ι�° �ݺ����� ����)
			}
		}

		System.out.printf("==============LABEL \n");

		OUTER: for(int i=0;i<3;i=i+1) {
			System.out.printf("ù��° �ݺ���\n");
			for(int j=0;j<3;j=j+1) {
				System.out.printf("�ι�° �ݺ���\n");
				break OUTER;
			//break�� continue �ڿ� ���̺��� ���̸� ���̺� �ش��ϴ� ����� ������ �ݴϴ�.
			}
		}
	}
}
