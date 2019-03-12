package project0214;

import java.util.Scanner;

public class class001 {

	public static void main(String[] args) {
		// Switch : 값에 의한 분기
		/*
		 Switch : 값에 의한 분기
		 	1. 형식
		 		switch (표현식){
		 				case 값 1 : 
		 						표현식의 결과가 값 1일 때 수행할 내용
		 						(break;)			//쓸 수도 안 쓸 수도 있는 내용
		 				case 값2 :
		 						표현식의 결과가 값2일 때 수행할 내용
		 						.
		 						.
		 						.
		 				default : 수행할 내용		_else?
		 						(break;)
		 		cf) 표현식 : 변수 / 연산식 / 리턴이 있는 함수 호출
		 	2. 규칙
		 		1) 표현식의 결과는 정수 아니면 String _ 실수 불가! ( 어제 기억했지 ? 2.0 - 1.8 이랑 0.2 같지 않다고 하는 거)
		 								string은 1.7 버전 이상부터 가능해짐(현업_공공기관 에서는 1.6을 써요
		 		2) default 생략 가능 (하지만 default를 써서 예외상황 처리하는 것을 추천)
		 		3) break를 생략할 수 있는데, 생략하면 fallthrow...(값1이 맞으면 브레이크하고 이 식에서 나가야되는데 생략하면 아래의 행동까지 전부 함.()
		 		4) 값을 쓸 때 상수와 Literal만 가능
		 */
		
		//메뉴(정수)를 입력받기 위한 구문
		
		final int VETNAM = 1; //변수의 자료형 앞에 final이 붙으면 데이터를 변경할 수 없는 '상수'가 됨.
		final int CHINA = 2;
		final int JAPAN = 3;
		final int KOREA = 4;
			//이렇게 상수를 만들어서 작업하면 아래 케이스 이름만 보고 무슨 내용인지 읽기가 쉬워짐
		Scanner sc = new Scanner(System.in);
		System.out.printf("메뉴 입력(1~4) :");
		int menu = sc.nextInt();
		switch (menu){
			case VETNAM : System.out.printf("쌀국수\n");
				break;
			case CHINA : System.out.printf("간짜장\n");
				break;
			case JAPAN : System.out.printf("사누끼우동\n");
				break;
			case KOREA : System.out.printf("잔치국수\n");
				break;
			default : System.out.printf("잘못된 입력입니다.\n");
				break;
		}
		sc.close();

	}

}
	/* Java에서 constant(상수)만들기
		상수는 값이 변하지 않는 읽기 전용의 데이터
		java에서는 변수의 자료형 앞에 final을 붙이면 상수가 됩니다.
		java나 C에서는 상수의 이름을 모두 대문자로 하는 것을 권장
		상수를 적절하게 이용하면 상수는 읽기전용을 구현하기 위해 사용하기도 하지만 코드의 가독성을 높이기 위해 사용하는 경우도 많다.
					+) 상수를 사용하면 실제 실행 코드를 수정하지 않고 입력받을 부분/상수설정 부분만 수정해도 괜찮아서 이후 유지보수에 용이하다.
		*/	