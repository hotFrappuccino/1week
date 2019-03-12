package project0213;

import java.util.Scanner;

public class practice003 {

	public static void main(String[] args) {
		//하나의 점수(int)를 입력받아 저장하는 구문을 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요 : \n");
		int score = sc.nextInt();
		
		//score가 60점 이상이면 합격이라고 출력 - if를 이용하여 작성
		System.out.printf("if만 있는 경우\n=======");
		if(score>=60) {
			System.out.printf("합격\n");
		}
		
		//score가 60점 이상이면 합격 그렇지 않으면 불합격이라고 출력
		System.out.printf("if와 else 있는 경우\n=========");
		if(score>=60) {
			System.out.printf("합격\n");
		}
		else {
			System.out.printf("불합격\n");
		}
		
		//score가 90~100이면 수, 80~90미만이면 우, 70~80미만이면 미, 60~70미만이면 양, 0~60미만이면 가 라고 출력
		System.out.printf("else if까지 있는 경우 \n========");
		if(score>=90 && score<=100) {
			System.out.printf("수\n");
		}
		else if(score>=80 && score<90) {
			System.out.printf("우\n");
		}
		else if(score>=70 && score<80) {
			System.out.printf("미\n");
		}
		else if(score>=60 && score<70) {
			System.out.printf("양\n");
		}
		else if(score>=0 && score<60) {
			System.out.printf("가\n");
		}
		else {
			System.out.printf("잘못된 점수를 입력하셨습니다.\n");
		}
		//if와 else if가 같이있는 경우에 else는 예외적인 상황 발생을 처리합니다.
		sc.close();
		
		
	}

}
