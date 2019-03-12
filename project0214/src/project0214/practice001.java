package project0214;

import java.util.Scanner;

public class practice001 {

	public static void main(String[] args) {
			//입력하는 데이터를 정수 대신 문자열로 변경
			//베트남, 중국, 일본, 한국으로 변경
			final String VETNAM = "베트남";
			final String CHINA = "중국";
			final String JAPAN = "일본";
			final String KOREA = "한국";
				//이렇게 상수를 만들어서 작업하면 아래 케이스 이름만 보고 무슨 내용인지 읽기가 쉬워짐
			Scanner sc = new Scanner(System.in);
			System.out.printf("메뉴 입력(베트남/중국/일본/한국) :");
			String menu = sc.nextLine(); //menu 변수가 int이면 string을 입력받을 수 없음. 그거 기억하기!
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
			}		//입력을 숫자로 받겠다 하고 문자열이 들어오면 에러발생. 입력을 문자열로 받으면 숫자가 입력되도 default로 처리해낼 수 있음.
			sc.close();

	}

}


