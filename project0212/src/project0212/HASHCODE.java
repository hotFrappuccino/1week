package project0212;

public class HASHCODE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 ***문자열 저장
		 문자열은 0개 이상의 문자집합
		 리터럴로 작성할 때는 ""안에 원하는 문자집합을 그냥 작성하면 됩니다.
		 변수에 저장하고 싶을 때는 String이라는 자료형을 사용
		 
		 String name ="박문석";
		
		 true나 false : boolean
		 숫자 - 정수 : byte, short, char, int, long
		      실수 : float, double
		문자열 - string
		 */
		
		/*
		 ***Literal 저장
		 Literal은 맨 처음 사용될 때 상수 pool에 저장하고 다음부터는 공유해서 사용합니다.
		 System.identityHashCode(데이터)를 호출하면 데이터가 실제 저장된 곳의 코드값을 알 수 있습니다.
		 이 코드값이 동일하다면 동일한 위치의 데이터를 공유하고 있다는 것 확인
		 */
		System.out.println("=====================해시코드 확인===================");
		int ㄱ = 10;
		int ㄴ = 10;
		int ㄷ = 11;
		long ㄹ = 11L;
		
		System.out.println("ㄱ:" + System.identityHashCode(ㄱ));
		System.out.println("ㄴ:" + System.identityHashCode(ㄴ));
		System.out.println("ㄷ:" + System.identityHashCode(ㄷ));
		System.out.println("ㄹ:" + System.identityHashCode(ㄹ));
		
		//a,b는 같은 값을 가리키므로 같은 코드.
		//c는 값이 달라서 다른코드
		//c와 d는 값이 같지만 자료형이 달라서 다른 코드.
		
		System.out.println("=====================System.out.printf===================");
		/*
		***System.out.printf
		 포맷을 설정해서 데이터를 콘솔에 출력하는 메소드
		 포맷은 %로 시작합니다.
		 포맷을 설정한 후 데이터를 매핑시키는 구조로 출력합니다.
		 
		 System.out.printf("메시지 %포맷...",데이터 나열...)
		 포맷 하나와 뒤에 나오는 데이터가 하나씩 매핑되서 출력됩니다.
		 */
		 /*
		 정수 포맷 : %d,
		        %숫자d - 숫자만큼 자리를 확보한 후 데이터를 출력.
		                           확보한 자리보다 숫자의 자릿수가 크면 숫자 전체를 출력합니다.
				%0숫자d - 남는 자리를 0으로 채움
				%-숫자d - 왼쪽맞춤
		 */
		int aa = 10;
		System.out.printf("aa:%d\n",aa);	//a:10
		System.out.printf("aa:%7d\n",aa);	//a:     10
		System.out.printf("aa:%1d\n",aa);	//a:10
		System.out.printf("aa:%07d\n",aa);	//a:0000010
		System.out.printf("aa:%-7d\n",aa);	//a:10
		
		/*
		실수포맷 : %f : 소수 6자리 출력
				%전체자리수.소수자리수f : 자릿수 이하에서 반올림
				%.소수자리수f : 자릿수 이하에서 반올림
				%g : 저장한 그대로
				%e : 지수표기법으로 출력
		 */
		double dd = 12.765478;
		System.out.printf("dd:%.4f\n",dd);	//d:12.7655
		
		/*
		문자 포맷 : %c
		문자열은  : %s
		boolean : %b, %B   - b는 소문자로 true, B는 대문자로 TRUE
		 */
		System.out.println("=====================실습===================");
		int a = 8;
		int b = 197;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------------------------------");
		//5자리로 a를 출력하고 남는 자리는 0으로 채우기
		System.out.printf("%05d\n", a);
		System.out.printf("%05d\n", b);
		
		System.out.println("-----------------------------------");
		double d = 3.26566172;
		System.out.println(d);
		//소수 3째자리까지 출력 - 4번째 자리에서 반올림
		System.out.printf("%.3f", d);
		
	}

}
