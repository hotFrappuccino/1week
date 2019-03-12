package project0215;

public class class003 {

	public static void main(String[] args) {
		/*
		 ***********데이터의 모임이 생기면 일어나는 일
			기술통계	- 합계, 평균, 개수, 최대값, 최소값, 표준편차, 분산, 중앙값, 석차.....
			가공		- 병합, 필터, 정렬.......
							-최대, 최소값을 필터링한다던가, 너무 말도안되는 건 필터링하는 식으로 꼭 걸러야함.
							
			map하고 filter는 어느 프로그램이어도 있어요. 그건 진짜 꼭 필요하다는 뜻. 꼭꼭!!
		 */
		
		int [] ar = {40,70,30,65,93,48,87};
		// 60점 이상인 데이터의 합계, 개수, 평균(소수 2자리까지 출력)
		
		//합계를 구할 때는 합계!라는 변수를 만들어서 그 값을 초기설정값!!으로 만들어줘야함(보통 0이지만 아닐수도 있음.)
		
		int sum=0; //합계
		int cnt=0; //개수
		
		
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
			System.out.printf("조건에 맞는 값이 없음.");
		}
		
		System.out.printf("\n-----------------------------\n");
		//최대값 : 최대값을 저장할 변수를 만들고 데이터 범위보다 작은 값으로 초기설정._배열의 첫번째값 가능.
			//모든 요소와 최대값 변수를 비교해서 요소의 값이 최대값보다 크다면 최대값을 요소의 값으로 변경.
		int max=0;
		for(int x:ar) {
			if (max<x) {
				max = x;
			} 
		}
		System.out.printf("%d\n", max);

		System.out.printf("\n-----------------------------\n");
		//최소값 : 최소값을 저장할 변수를 만들고 데이터 범위 중 가장 큰 값으로 초기설정._배열의 첫번째값 가능.
			//모든 요소와 변수를 비교해서 요소의 값이 최소값보다 작면 최소값을 요소의 값으로 변경함
		int min=100;
		for(int x:ar) {
			if (min>x) {
				min = x;
			} 
		}
		System.out.printf("%d\n", min);
		int [] ar1 = {40,70,30,65,93,48,88};
		int[]ar2= {51,73};
		//************2개 배열의 데이터를 저장할 배열
		int [] merge = new int [ar1.length+ar2.length];	//
		for(int i=0;i<ar1.length;i=i+1) {
			merge[i]=ar1[i];
		}
		//ar2의 내용을 merge에 복사하세요. 그리고 출력.
		
		for(int i=0;i<ar2.length;i=i+1) {
			merge[i+ar1.length]=ar2[i];
		}
		for(int e:merge) {
			System.out.printf("%d  ", e);
		}

	}
}
