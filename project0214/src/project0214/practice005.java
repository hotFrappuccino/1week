package project0214;

public class practice005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			*****
			*****
			*****
			*****
			*****
		System.out.printf("*") �� System.out.printf("\n")�� �̿�
		 */

		for(int i=0;i<5;i=i+1){
			for(int j=0;j<5;j=j+1) {
				System.out.printf("*");
			}
		System.out.printf("\n");
		}
		
		/*
		 	*
		 	**
		 	***
		 	****
		 	*****
	System.out.printf("*") �� System.out.printf("\n")�� �̿�
	 */
	
		for(int i=0;i<5;i=i+1){
			for(int j=0;j<=i;j=j+1) {
				System.out.printf("*");
			}
		System.out.printf("\n");
		}
		
		
		/*
		i			j
	 	0	*		0-0
	 	1	**		0-1
	 	2	***		0-2
	 	3	**		0-1
	 	4	*		0-0
System.out.printf("*") �� System.out.printf("\n")�� �̿�
	-�����ϸ� ���� �Ҽ��ִ� �ͱ��� �ؼ� ������, �Ҽ��ִ� �ͳ��� �ϴ� �� ���ھ�.
 */

		for(int i=0;i<5;i=i+1){
			if(i<=2) {
				for(int j=0;j<=i;j=j+1) {
					System.out.printf("*");
				}
			}else {
					for(int j=0;j<=4-i;j=j+1) {
						System.out.printf("*");
					}
			}
			System.out.printf("\n");
		}
	}
}


