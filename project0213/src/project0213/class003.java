package project0213;

public class class003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 5;
		//n1과 n2 중 큰 수 찾기
		int result = n1>n2 ? n1 : n2;
		System.out.printf("result:%d\n", result);
		
		//성별은 F 또는 M으로 저장
		char gender = 'm';
		//gender가 M 이면 남자라고 출력, F 이면 여자라고 출력
		//삼항연산자 이용해서 해결
		String x = gender=='M'?"남자":"여자"; //얘는 m을 인식 못해서 m은 여자라고 출력
		System.out.printf("성별:%s\n", x);
		
		x = gender == 'M'||gender=='m' ? "남자":"여자";
		System.out.printf("성별:%s\n", x);
		
		//정수변수에 0~100까지의 숫자를 저장하고
		//60 이상이면 합격, 그렇지 않으면 불합격이라고 출력
		
		int score =70;
		String pr = score>=60 ? "합격":"불합격";
		System.out.printf("합격여부:%s\n", pr);
		
		//score가 80 이상이면 우수, 60 이상이면 보통, 그 이하는 저조라고 출력
		
		pr= score>=80?"우수": score>=60? "보통":"저조";
		System.out.printf("등급:%s\n", pr);
	}

}
