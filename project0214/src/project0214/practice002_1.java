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
		System.out.printf("\n==============1부터 10까지의 합계\n");
		
		
		//1부터 10까지의 합계를 구해봅시다.
		i=1;
		int sum=0;
		while(i<11) {
			sum = sum +i;
			i=i+1;
		}
		System.out.printf("합계:%d\n",sum);
		
		//1부터 10까지 숫자 중에서 짝수의 합
		
		i=0;
		sum=0;
		while(i<11) {
			sum = sum +i;
			i=i+2;
		}
		System.out.printf("짝수의 합:%d\n",sum);
		
		//1부터 10까지의 평균을 소수 첫째자리까지 구해서 출력.
		i=1;
		sum=0;
		while(i<11) {
			sum = sum +i;
			i=i+1;
		}	
		double avg = (double) sum / 10;
		System.out.printf("평균:%f\n",avg);
		
	}

}
