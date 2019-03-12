package project0212;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		//age = 20000000000000;;   불가능. 변수는 자신이 저장할 수 있는 크기보다 큰 숫자는 저장할 수 없음.
		//long형 정수변수를 생성하고 데이터를 저장해야 함.
		long bigsu = 200000000000000L;
		//문자 1개는 char에 저장 가능
		//문자는 숫자로 저장해도 되고 '문자'이렇게 저장해도 됨.
		//char가 다른 정수와 다른 점은 출력할 때는 문자로
		char ch = 65;
		short s = 65;
		System.out.println("ch:" + ch);
		System.out.println("s:"+s);
		
		//실수는 float과 double이 있습니다.
		float f = 3.7f; //float 은 뒤에 f를 붙여서 사용
		double d = 3.7;
		
		
		//boolean은 true or false
		boolean b = true;
		//하나의 영역에 동일한 이름의 변수를 2개 이상 만들 수 없습니다.
		// int b; 
		
		//메모리 크기가 큰 변수에 작은 크기의 데이터를 쓰는 것은 가능하지만 메모리 크기가 작은 변수에 크기가 큰 데이터는 대입할 수 없습니다.
		//byte < short < char < int < long < float < double
		
		
		/*나이와 키와 성별을 저장하는 변수를 만들고 데이터를 저장한 후 출력
		성별은 M이나 F로 저장
		나이는 정수로 키는 실수로 생성*/
		int age = 29;
		double height = 160.0;
		char gender = 'F';
		
		System.out.println("나이는" + age);
		System.out.println("키는" + height);
		
		System.out.println("성별은" + gender);
	}

}
