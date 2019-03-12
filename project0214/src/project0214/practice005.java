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
		System.out.printf("*") 와 System.out.printf("\n")만 이용
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
	System.out.printf("*") 와 System.out.printf("\n")만 이용
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
System.out.printf("*") 와 System.out.printf("\n")만 이용
	-복잡하면 내가 할수있는 것까지 해서 나누고, 할수있는 것끼리 하는 게 좋겠어.
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


