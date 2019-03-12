package project0215;

public class class002 {

	public static void main(String[] args) {
		/*	다차원배열
					배열의 차원이 2개 이상인 배열
		1. 생성
			1) 배열의 크기를 처음부터 결정
				자료형 [][] 배열이름 = new 자료형 [개수][개수];
			2) 배열의 첫번째 차원 크기만 결정하고 나중에 두번째 이후의 크기를 결정
				자료형 [][] 배열이름 = new 자료형 [개수][];
				배열이름[0]=new자료형[개수];
				배열이름[1]=new자료형[개수];
					->데이터의 갯수가 일정하지 않을 때.
			3) 초기 데이터를 가지고 만들 때
				자료형 [][] 배열이름 = {{데이터나열},{데이터나열},{데이터나열},.....}
		2. length
			생략한 인덱스의 개수입니다.
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
		
		String [][] person = {{"유관순","안옥윤"},{"윤봉길","안중근"}};
		System.out.printf("%s", person[0][1]);
		
		/*
		 * 
		 * 
		 */
		
		
		
		
		
	
	}

}
