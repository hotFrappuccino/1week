package project0214;

public class class003 {

	public static void main(String[] args) {
		/* break와 continue
		break는 switch나 반복문 안에서 사용되어 자신을 포함하고 있는 제어문 중 가장 가까운 switch나 반복문을 빠져나가는 명령어
		continue는 반복문 안에서 반복문의 맨 윗부분으로 이동
			=>이 두개의 제어문은 switch에서 사용되는 경우를 제외하고 대부분 if와 같이 사용..
		     왜????
			while(true)해서 무한반복하다가 if(어떤 조건이 되면) 멈추도록 할 수 이씀.
		label을 이용한 break와 continue
			=>반복문이 중첩되서 사용된 경우 break와 continue는 가까운 반복문에 적용이 됩니...다?
			=>반복문에 label을 사용하면 break나 continue 뒤에 label을 붙여서 label에 해당하는 반복문에 적용 가능.
		 */
		
		System.out.printf("==============break \n");

		for(int i=1;i<=10; i=i+1) {
			//3의 배수가 되면 반복문을 종료
			if(i%3==0) {break;}
			System.out.printf("i:%d\n",i);
		}
		
		
		System.out.printf("==============continue \n");

		for(int i=1;i<=10; i=i+1) {
			//3의 배수가 되면 반복문을 수행 X
			if(i%3==0) {continue;}
			System.out.printf("i:%d\n",i);
		}
		
		//break는 반복 자체를 종료 하고 continue는 그 때에만 반복문 나오지 않는 그것. RGRG?

		for(int i=0;i<3;i=i+1) {
			System.out.printf("첫번째 반복문\n");
			for(int j=0;j<3;j=j+1) {
				System.out.printf("두번째 반복문\n");
				break; //break는 가장 가까운 switch나 반복문에 영향을 줍니다.(이 경우 두번째 반복문에 영향)
			}
		}

		System.out.printf("==============LABEL \n");

		OUTER: for(int i=0;i<3;i=i+1) {
			System.out.printf("첫번째 반복문\n");
			for(int j=0;j<3;j=j+1) {
				System.out.printf("두번째 반복문\n");
				break OUTER;
			//break나 continue 뒤에 레이블을 붙이면 레이블에 해당하는 제어문에 영향을 줍니다.
			}
		}
	}
}
