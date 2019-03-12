package project0212;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0.1을 1000번 더하면 100.0이 나와야하는데 이상한 결과가 출력
		/*
		 왜냐면 말이죠. 그건 바로 십진수 소수자리를 이진수로 바꾸다가 순환소수?가 되기 때문입니다. 그 방법은 너의 머릿속.
		 순환소수이다보니 근사값이어서 얘가 조금씩 오차 뽝! 1000번 더하면 오차가 더 크게 빡!
		 */
		//소수를 이진수로 표현할 때 정확하게 표현하기 어렵기 때문에 이런 현상 발생
		//실수 연산을 여러 번해야할 때는 정수로 변경 후  연산 후 실수로 변경
		double d = 0.1;
		double sum = 0.0;
		for (int i=0; i<1000; i=i+1) {
			sum=sum+d;
		}
		System.out.println("합계:" + sum);
		
		boolean pan =  (2.0 - 0.8) == 0.2;
		System.out.println(pan);
		
		//오버플로우 (인트가 저장할 수 있는 숫자 이상으로 연산하는 경우 천장을 뚫고 아래로 올라옴)
		int n = 2147483647;
		int result = n+1;
		
		
		System.out.println("결과:" + result);
		
		//언더플로우
		n=-2147483648;
		result = n-1;
		System.out.println("결과:" + result);
		
		
		/*
		 오버플로우와 언더플로우가 발생하는 이유!!!!!!!!!!!!!!!!!!!
		 컴퓨터는 숫자를 2진수로 저장하는데 음수를 2의 보수로 저장함.
		  -> 그러므로 01111.....1(2)를 넘어서 1000...00(2)가 되면 음수가 되버리는 거임. 오키오키?
		*/
	}

}
