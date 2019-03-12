package project0214;

public class practice002 {

	public static void main(String[] args) {

		System.out.printf("====================Hello JAVA 3번 출력_세번 쓰기\n");
		//Hello JAVA를 3번 출력
		System.out.printf("Hello JAVA\n");
		System.out.printf("Hello JAVA\n");
		System.out.printf("Hello JAVA\n");
		
		
		System.out.printf("====================Hello JAVA 3번 출력_for 이용\n");
		int i;
		for(i=0;i<3;i=i+1){
		System.out.printf("Hello JAVA\n");
		}
		
		//두개의 값이 같고, 심지어 위가 더 빠름. 하지만 여기서 멘트를 바꾸라고 하면 아래가 훨씬 쉬움. 그래서 이렇게 하자는 거임. ㅇㅇ?
		
		
		System.out.printf("====================for 사용 _0~2까지 순서대로 출력\n");
		//0~2까지 순서대로 출력
		for(i=0; i<3;i=i+1) {
			System.out.printf("i=%d\n", i);
		}
		System.out.printf("====================for 사용_1,2,3을 출력\n");
		//1,2,3을 출력
		for(i=0; i<3;i=i+1) {
			System.out.printf("i=%d\n", i+1);
		}

		System.out.printf("====================for 사용_0,2,4를 출력\n");
		//0,2,4를 출력
		for(i=0; i<3;i=i+1) {
			System.out.printf("i=%d\n", i*2);
		}
	
		for(i=0; i<6;i=i+1) {
			System.out.printf("i=%d\n", 1<<i);
		}
		
		System.out.printf("===================while 사용\n");
		
		i=0;		//for에서 1번 표현식이 되는 부분
		while(i<3) {	//for에서 2번 표현식 자리에 나오는 boolean이 출력되는 식
			System.out.printf("i=%d\n",i);
			i=i+1;		//for에서 3번 표현식이 되는 부분
		}

		System.out.printf("===================do~while 사용\n");
		
		i=0;		//for에서 1번 표현식이 되는 부분
		do{
			System.out.printf("i=%d\n",i);
			i=i+1;		//for에서 3번 표현식이 되는 부분
		}while(i<3); //; 빠뜨리지 않도록 주의
	}

}
