package project0215;

public class practice003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar1 = {40,70,30,65,93,48,88};
		int[]ar2= {51,73,80,90,11};
		
		//두 배열 합치기
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
		
		//60이 넘는 데이터의 갯수, 총합, 평균
		int sum=0;
		int cnt=0;
		
		for(int data: merge) {
			if(data>=60) {
				sum=sum+data;
				cnt=cnt+1;
			}
		}
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("개수 : %d\n", cnt);
		
		if(cnt!=0) {
			double avg =(double)sum/cnt;
			System.out.printf("평균 : %.2f\n",avg);
		} else {
			System.out.printf("해당 값이 존재하지 않습니다.\n");
		}
		//최대값과 최소값
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
		
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값: %d\n", min);
		
	}

}
