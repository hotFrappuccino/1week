package project0212;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		byte b1 = 10;
		byte b2 = 20;
		//int보다 작은 크기 데이터끼리 연산을 하면 int로 변경해서 연산을 수행.
		//그래서 연산 결과를 byte로 저장할 수 없음!!
		//ex) byte result = b1 + b2
		int result = b1+b2;
		System.out.println(result);
		
		int x = 100;
		//표현범위가 큰 데이터는 작은 표현범위의 변수에 대입이 되지 않으.ㅁ
		// 이럴 때 강제로 대입하기 위해 intㄹ로 변경을 시켜서 대입
		// 이 경우 데이터손실에 유의해야 합니다.
		//byte b = x;
		
		//x를 byte로 변경해서 b에 대입
		byte b =(byte)x;
		System.out.println("b:"+ b);
		x=200;
		b=(byte)x;
		System.out.println("b:"+b);
		
		
		//실수를 정수로 강제형변환하면 소수가 없어짐.
		double d = 3.84;
		//실수를 정수에 대입하기 위해서는 강제로 정수데이터로 변경해야 함.
		x= (int)d;
		System.out.println("x:"+x);
		
		int n1 = 15;
		int n2 = 2;
		//작은 표현범위 숫자 데이터를 큰 표현범위의 데이터로 변경하는 이유는 원하는 결과를 얻기 위해서 입니다.
		double r = (double)n1/n2; //double하고 int를 계산하면 double이 나오니까 둘 중에 하나만 double값이어도 됨.
		System.out.println("r:"+r);
		
		double su = 5.6;
		//위의 숫자를 소수 첫째자리에서 반올림해서 출력
		//5.6이면 6으로, 5.4이면 5로 출력
		
		int h;
		h = (int)(su+0.5);
		System.out.println("h:"+h);
		su = 5.4;
		h = (int)(su+0.5);
		System.out.println("h:"+h);
		

		su = 5.46;
		//위의 숫자를 소수 둘째자리에서 반올림해서 출력
		//5.46이면 5.5으로, 5.44이면 5.4로 출력
		
		su=su*10;
		h = (int)(su+0.5);
		su=h/10.0;
		System.out.println("su:"+su);
		
		su = 5.44;
		su=su*10;
		h = (int)(su+0.5);
		su=h/10.0;
		System.out.println("su:"+su);
	}

}
