package project0213;

public class class002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		** shift 연산자
			*int형 데이터를 가지고 bit 단위로 밀어내고 결과를 int로 리턴하는 연산자
			*<<, >>, <<<
				a<<b - a를 b bit만큼 왼쪽으로 이동 : 첫번째 비트는 빼고
			  ex) 23<<2 =92
			      23>>2 = 5
			  int a = 23:
			  *****<<,>> : 첫번째비트는 빼고 시프트
			  *****<<< : 첫번째 비트도 포함해서 왼쪽으로 시프트
		*/
		
		System.out.printf("%d\n", 23<<2);
		System.out.printf("%d\n", 23>>34);  //32번 이상 밀지는 않습니다. ->그렇게 되면 %32한 만큼만 밀어냅니다.
											//이거 int여서 32번 밀면 남는 게 없. 그래서 32이상 시프트는 안되는 거임.ㅇㅇ?
		System.out.printf("%d\n", 23>>2);
		System.out.printf("%d\n", 16<<27);
		
		//연산의 우선순위  : 단항 > 사칙연산 > shift > 비트논리연산자 > 관계연산자 > 조건논리연산자
		
		/*
		 관계연산자
		 	1. 비교연산자 (>,>=,<,<=)
		 		숫자 데이터를 가지고 연산하고 결과는 boolean
		 	2. 등가연산자 (==(같다), !=(다르다))
		 		모든 데이터에 다 사용가능. 결과는 boolean
		 */
		
		
		
		/*
		*** 논리연산자
			1. 비트논리연산자 (&(and), |(or), ^(xor_Exclusive OR)) _ 데이터의 저장원리를 이해해야 이해한다!
				int형 데이터 2개를 가지고 bit단위로 연산해서 결과를 정수로 리턴하는 연산자
					& : 둘 다 1일 때 1, 그 이외에는 0을 산출함		ex) 20(10100(2))&17(10001(2)) : 10000(2)=16
						도대체 어디서 쓰지..? -> 그래픽 프로그램(겹치는 것 ), 시스템 프로그래밍(&0으로 지우기,포맷 등에 적용)
					| : 둘다 0일 때 0, 그 이외에는 1을 산출함		ex) 20(10100(2))|17(10001(2)) : 10101(2)=21
						얘는 어디서 쓰지..?  -> 그래픽(빨강+빨강=빨강(살린다 죽인다)), 시스템프로그래밍(|0으로 기록하는 프로그램)
					^ : 같으면 0, 다르면 1 산출				ex) 20(10100(2))^17(10001(2)) : 00101(2)=5
						컴퓨터는 덧셈할 때 xor의 원리를 이용 (1+1=0, 내 자리기준)

		System.out.printf("%d\n", 20&17);
		System.out.printf("%d\n", 20|17);
		System.out.printf("%d\n", 20^17);
		
		/*
		2. 조건논리연산자 (&&(and), ||(or))
		boolean 데이터 2개를 가지고 연산해서 결과도 boolean으로 리턴
			&& : 둘 다 true일 때만 true, 그 이외에는 false
			|| : 둘 다 false일 때만 false, 그 이외에는 true
			
			-> &&가 |보다 우선순위가 높습니다. (여태까지 배운 연산자들 중에서는 우선순위 제일 낮음)
			&&는 앞쪽 연산의 결과가 false이면 결과는 false이므로 앞쪽의 결과가 false이면 뒤는 확인하지 않음
			   ||는 앞쪽의 연산결과가 true이면 결과가 true이므로 앞쪽의 결과가 true이면 뒤를 확인하지 않는다.
		*/
		
		System.out.printf("%B\n", true&&false);
		System.out.printf("%B\n", true||false);
		
		int x = 10;
		boolean result = x>5 && ++x <5; //앞이 true기 때문에 뒤에 ++x가 계산되서 x값이 11로 끝남
		System.out.printf("x:%d\n",x); 
		result = x>20 && ++ x>5;		//앞이 false기 때문에 뒤에 ++x는 쳐다도 안보고 x값이 11로 끝남.
		System.out.printf("x:%d\n",x);
		
		
		int year = 2019;
				//year가 2000 이상인지 확인
		result = year>=2000;
		System.out.printf("2000이상:%b\n",result);
				//year가 4의 배수인지 확인
		result = year%4 ==0;		
		System.out.printf("4의 배수:%b\n",result);
				//year가 4의 배수이고 100의 배수가 아닌 경우를 확인
		result = year%4==0 && year%100!=0;
		System.out.printf("4의 배수이고 100의배수가 아님:%b\n",result);
				//year가 (4의 배수이고 100의 배수가 아닌 경우) 또는 400의 배수인 경우 확인
		result = year%400==0||year%4==0 && year%100!=0;
		System.out.printf("윤년여부:%b\n",result);
		
		
				// 1~100까지의 데이터가 있습니다.
				//3의 배수이고 4의 배수인지 확인
				/* 1.3의 배수를 확인하고 4의 배수를 확인하는 것이 좋은지
				   2.4의 배수를 확인하고 3의 배수를 확인하는 것이 좋은지 판단!!
				   && 할때는 2가 유리(첫 필터링으로 25개만 거르니까 작업 총 125번)
				   || 할때는 1이 유리 (작업횟수 총 167번)
				   
				 */

	}

}
