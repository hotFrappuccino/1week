package project0213;

import java.util.Scanner;

public class class005 {

	public static void main(String[] args) {
		
		/*
		 키보드로부터 입력받기
		 java.util.Scanner 클래스를 이용하면 키보드로부터 입력을 받을 수 있습니다.
		 Scanner 변수명 = new Scanner (System.in);
		 
		 입력받은 내용을 저장할 변수명 = 변수명.nextInt()
		 정수를 입력받을 때는 nextInt()
		 실수를 입력받을 때는 nextDouble()
		 불린을 입력받을 때는 nextBoolean()
		 문자열을 입력받고자 할 때는 nextLine()
		 */
		
		
		//한줄한줄 왜 이걸 써야되는지 생각하고 고민하면서 코딩합시다//
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를입력하세요:"); //그냥 블랭크 상태에서 입력하라는지 어쩌는지 알겠어? 꼭꼭.
		int r = sc.nextInt();
		System.out.printf("점수 : %d\n", r);
		
		System.out.printf("이름을입력하세요:");
		sc.nextLine();						//점수 입력하고 누른 enter를 이걸로 처리하라는 깊은 뜻. 얘도 꼭 넣어주기.
		String name = sc.nextLine();
		System.out.printf("이름 : %s\n", name);
		

	}

}
