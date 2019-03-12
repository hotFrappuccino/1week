package project0212;

public class Oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		***~(틸드)연산자
			보수(이진법에서 0과 1의 위치를 서로 바꾼 수)를 구해서 반환해주는 연산자.
			절댓값을  + - 1 하고 부호가 반대로 바뀐다.
			
			-> 그래픽 프로그램 등에서 색상 반전 등을 만들 때 사용... 일반적으로는 잘 사용하지 않음.
		*/
		
		/*
		***! 연산자
			boolean 데이터에만 사용할 수 있는 연산자.
			true를 false로 변환하고 false를 true로 변환하는 연산자(낫게이트?)
		 */
		
		/*
		***++,-- 연산자 : 증감연산자
			정수 변수에만 사용할 수 있습니다.
			++ 는 정수변수의 값을 1 증가시키는 연산자
			-- 는 정수변수의 값을 1 감소시키는 연산자
		 */
		;
		int a = 10;
		a++;
		System.out.printf("a:%d\n",a);      //11
		a--;
		System.out.printf("a:%d\n",a);      //10
		
		/*
		   ++와 --는 변수의 앞에 사용해도 되고 변수의 뒤에 사용해도 됩니다.
		   명령문 안에서 ++나 --를 사용하게 되면 앞에 있을 때와 뒤에 있을 때 다르게 동작함.
		   ++가 앞에 있을 때는 변수의 값을 증가시킨 후 명령문에 적용하고, 뒤에있을 때는 명령문이 작동한 뒤에 값을 증가.
		 */
		System.out.printf("a:%d\n",a++);      //10을 출력하고 (프린트 값 10) a의 값을 11로 저장
		System.out.printf("a:%d\n",++a);      //a의 값을 12로 만들고나서 출력(프린트)
		
		a=0;
		int result = ++a + ++a;
		System.out.printf("result:%d\n", result);
		
		a=0;
		result = a++ + a++;
		System.out.printf("result:%d\n", result);
		//연산 도중에 ++나 --를 쓰면 코드의 가독성(읽기 쉬운 정도)가 떨어지기 때문에 이런 형태의 구문은 사용하지 않는 것을 권장
		
		
		
		System.out.println("====================================================");

		int money = 45390;
		//10의 자리에서 반올림해서 45400이라고 출력
		
		double h = money/100.0; //money/100을 하면 정수 나누기 정수이기 때문에 453.9가 아니라 453이 되어버림.
		money = (int)(h+0.5);
		
		System.out.printf("money:%d\n", money*100);
		
		
	}

}
