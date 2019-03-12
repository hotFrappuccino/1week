package project0215;

public class practice002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//먼저 바뀌는 게 안쪽, 나중에 바뀌는 게 바깥쪽
		
		for(int i=1;i<=9;i=i+1) {
			for(int j=2;j<=9;j=j+1) {
				System.out.printf("%2d * %2d = %2d  ",j,i,j*i);
			}
			System.out.printf("\n");
		}
		
		//모든 행의 크기가 동일한 2차원 배열
		//사람 이름 20개씩 5개 그룹을 저장할 수 있는 배열을 생성해라.
		String [][] person = new String[5][20];
		
		//행의 크기가 다른 2차원 배열
		//학생들의 점수(정수)를첫번째 그룹은 28개, 두번째 그룹은 33개, 3번째 그룹은 31개 저장할 수 있는 배열
		int [][] score = new int[3][];
		score[0]=new int[28];
		score[1]=new int[33];
		score[2]=new int[31];
		
		System.out.printf("%d\n",score.length);  //3
		System.out.printf("%d\n",score[0].length); //28
	//	System.out.printf("%d\n",score[0][0].length);  //is not a field
		System.out.printf("%s\n", score);	//얘는 주소를 뽑음. 그래서 심지어 에러코드
		System.out.printf("%s\n", score[0]);	//얘도 주소 뽑아서 에러코드(d 안된다고)
		System.out.printf("%d\n", score[0][0]);
		
		
		//초기 데이터를 가지고 2차원 배열을 생성
		String [][] play = {{"이불밖","다시봄","몬스터"},{"샵보이스","이스케이프플랜","더매치"},{"츠이오쿠","메르헨","블랙룸"}};
		//데이터 출력하는 방법
		int rowSize = play.length;
		for(int i=0;i<3;i=i+1) {
			int colSize = play[i].length;
			for(int j=0;j<3;j=j+1) {
				System.out.printf("%s  ", play[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		
		for(String bangtal[] : play) {
			for(String masterkey : bangtal) {
				System.out.printf("%s  ",masterkey);
			}
			System.out.printf("\n");
		}
	}

}
