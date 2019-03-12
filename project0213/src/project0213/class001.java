package project0213;

public class class001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 ( ) : 연산의 우선순위 변경
		 단항연산자 : ←(연산방향)
		 ~ : 1의 보수
		 ! : true → false / false → true
		 ++, -- : 증감
		 부호 ( +, - )
		 (자료형) 데이터 : 강제 형 변환
		 
		 */
		
		/*
		 사칙연산
		 % : 정수 데이터를 가지고  나머지를 구해주는 연산자
		 *, / : 숫자데이터를 가지고 곱하기와 나누기
		 +, - : 숫자 데이터를 가지고 더하기와 빼기
		 
		 1) 동일한 자료형으로 연산해야 한다.
		 2) 다른 자료형끼리 연산을 하는 경우 표현범위가 더 큰 자료형으로 변경해서 연산한다.
		 3) 연산의 결과는 연산을 수행한 데이터의 자료형으로 나타난다.
		 4) int보다 작은 자료형끼리 연산하면 int로 변경하여 수행한다.
		 
		 ★  *,+,-는 overflow, underflow를 조심한다.
		 ★ /의 어려움
			정수/정수 -> 정수가 나온다(실수가 나오게 하려면 어떻게 해야하는지 생각)
			정수/0 -> 분모에 들어갈 데이터가 0이 아닌지 꼭 체크
						+) 모든 작업을 할 때는 데이터가 존재하는 건지 체크하여 데이터가 있을 때는 ~~~ 없을 때는 `~~로 나눠서 작업.
		 ★  7%3 : 1 // 반복되는 작업, 일정한 패턴을 가지는 작업을 시킬 때 써먹음.
		 */
		
		byte b1 = 10;
		byte b2 = 20;		//사칙연산과 %연산은 최소진행단위 int / byte끼리 계산하더라도 수행될 때는 int
							//그래서 꼭 결과를 byte로 얻고 싶으면 강제형변환을 해야합니다.
							//표현범위가 큰 데이터를 작은 범위의 데이터로 형변환하면 데이터가 잘못 나올 수 있다.
	 	byte b3 = (byte)(b1+b2);
	 	System.out.printf("b3:%d\n", b3);
		
		//나눗셈을 할 때!!!!!!! 실수로 결과를 만들기
	 	double d = 10/3;			//이대로 돌리면 3.0이 나옴. 그러므로 숫자 두개중 하나를 .0으로 실수화 하거나 강제 형 변환
	 	System.out.printf("d:%f\n", d);
	 	
	 	//켜짐과 꺼짐을 번갈아 가면서 10번 하기
	 	for(int i=0; i<15; i=i+1) {
	 		try {
	 			//1초 대기
	 			Thread.sleep(1000);
	 			int r= i%4;
	 			if(r==0) {
	 				System.out.printf("빨강\n");
	 			}
	 			if(r==1) {
	 				System.out.printf("노랑\n");
	 			}
	 			if(r==2) {
	 				System.out.printf("초록\n");
	 			}
	 			if(r==3) {
	 				System.out.printf("파랑\n");
	 			}
	 		}catch(Exception e) {}
	 	}
	 	
		 	
	 	for(int i=0; i<30; i=i+1) {
	 		try {
	 			//1초 대기
	 			Thread.sleep(1000);
	 			int r= i%7;
	 			if(r==0) {
	 				System.out.printf("월\n");
	 			}
	 			if(r==1) {
	 				System.out.printf("화\n");
	 			}
	 			if(r==2) {
	 				System.out.printf("수\n");
	 			}
	 			if(r==3) {
	 				System.out.printf("목\n");
	 			}
	 			if(r==4) {
	 				System.out.printf("금\n");
	 			}
	 			if(r==5) {
	 				System.out.printf("토\n");
	 			}
	 			if(r==6) {
	 				System.out.printf("일\n");
	 			}
	 		}catch(Exception e) {}
	 	}
	 	
	 	
	 	
	 	
	}

}
