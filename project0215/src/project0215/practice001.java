package project0215;

public class practice001 {

	public static void main(String[] args) {
		
		//배열을 먼저 생성하고 나중에 데이터를 대입
		String [] redVelvet = new String[5];
		redVelvet[0] = "아이린";
		redVelvet[1] = "웬디";
		redVelvet[2] = "슬기";
		redVelvet[3] = "조이";
		redVelvet[4] = "예리";
				
		//배열의 요소 출력
		System.out.printf("%s\n", redVelvet[0]);
		System.out.printf("%s\n", redVelvet[1]);
		System.out.printf("%s\n", redVelvet[2]);
		System.out.printf("%s\n", redVelvet[3]);
		System.out.printf("%s\n", redVelvet[4]);
		
		System.out.printf("------------------\n");
		//이걸 반복문으로 고치면
			//.왜 고치냐면 1.코드의 라인 수를 줄이고 2.하나의 문장으로 처리하면 나중에 수정 등 유지보수에 유리
		int i=0;
		while(i<5) {
			System.out.printf("%s\n", redVelvet[i]);
			i=i+1;
		}

		System.out.printf("------------------\n");
		//배열의 데이터 갯수를 상수로 설정하면 나중에 데이터가 바뀌었을 때 에러가 생기니까 .length를 사용
		i=0;
		while(i<redVelvet.length) {
			System.out.printf("%s\n", redVelvet[i]);
			i=i+1;
		}
		System.out.printf("------------------\n");
		//데이터 갯수가 많아질수록 .length로 데이터 이동경로를 늘리는 것이 매우 비효율적.
		//반복문 안에서 동일한 데이터를 접근하는 경우 이 데이터가 heap에 저장된 데이터라면 가까운 곳으로 옮겨놓고 사용하는 것이 효율적.
		i=0;
		int x=redVelvet.length;
		while(i<x) {
			System.out.printf("%s\n", redVelvet[i]);
			i=i+1;
		}
		System.out.printf("------------------\n");
		//빠른 열거를 이용한 배열의 데이터 출력. for(데이터 변수 : 배열 ){실행할 내용} _얘는 순서대로밖에 못함
		for(String temp : redVelvet) {
			System.out.printf("%s\n", temp);
		}
	
		
	
	}

}
