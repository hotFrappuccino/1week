package project0215;

public class class001 {

	public static void main(String[] args) {
		/*데이터의 그룹화
		 동일한 데이터구조의 그룹	Array
		 					List
		 					Set
		 동일하지 않은 것도 가능함	Map
		 					Class
		 */
		/*
		 Stack - 함수, 실행 - 일시적, 크기제한(1MB)
		 Heap - 반영구적(삭제가능), 용량제한 없음_컴퓨터는 메모리가 부족하면 하드디스크에서 메모리를 빌려다 씀.
		 Method(Static) - 반영구적(삭제되지 않음), 용량제한 없음
		 */
		
		/*
		 Array (배열)
		 	->동일한 자료형의 데이터 모임(collection)
		 	-> heap 영역에 생성
		 	-> 처음에 크기를 정하면 크기 변경이 되지 않음(메모리 효율은 좋음...저장공간 이야기)
		
		 	1. 생성(선언)
		 		1) 선언
		 		   자료형 [] 배열이름 ;
		 		   자료형 배열이름 [];
		 		   둘 다 가능...
		 		2) 선언과 동시에 생성 가능
		 		  자료형 [] 이름 = new 자료형 [갯수];
		 		  -> 0 또는 0.0, false, null로 채워짐.
		 		3) 초기값을 설정해서 생성
		 		  자료형 [] 이름 = {값을 나열};
		 		4) 배열을 생성한 후
		 		  배열이름.length 를 호출하면 배열의 데이터 갯수가 리턴된다.
				5) 배열의 각 요소에 접근할 때
				 배열이름 [인덱스] 		_인덱스는 0부터 시작해서 length-1까지
		*/
		
		
		//배열을 선언한 후 나중에 메모리 할당하기
		int[] ar1 = null;
//		System.out.printf("%d\n", ar1.length);		 -> 이자리에서 이것을 한다면 NullPointerException이 생깁니다.
		ar1= new int [3];
		// 배열 선언 후, 메모리 갯수 3개임. 이렇게 정해준 거.
		
		//배열을 선언하면서 동시에 크기를 설정
		int [] ar2 = new int [4];

		//초기 데이터를 가지고 있는 경우 배열에 데이터를 대입해서 바로 생성
		String [] nation = {"대한민국", "뉴질랜드", "중국","영국"};
		
		System.out.printf("%d\n",nation.length); //배열이름.length는 데이터 갯수
		System.out.printf("%s\n", nation[1]);	// 0부터 시작하기 때문에 -1 위치 인덱스를 출력. 두번째 항목을 출력하려면 1!!!! 
		System.out.printf("%s\n", nation[3]);
		
		//배열의 데이터를 변경하고 싶으면 배열요소에 데이터 대입
		
		nation[2] = "독일";
		
		//배열의 데이터를 삭제 - 배열이름에 null을 대입
		
		ar2=null;
		
		
		
		String[] ar = {"월","화","수","목","금","토","일"};
		
		for (int i=0; i<4; i=i+1) {
			System.out.printf("%s\n", ar[i]);
		}
		
		
		/* MVC(Model View Controller) 패턴
			Model		데이터를 생성하고 처리하는 부분
			View		출력하는 부분
			Controller	Model과 View를 연결시켜주는 부분
	
		프로그램은 역할별로 분리해서 작성 - 왜냐면 하나의 변경이 다른 하나에 영향을 미치는 것을 최소화
		 */
	
		//★★★★★ 위에 꺼를 바꿔보는 거얌.
		for (int i=0; i<ar.length; i=i+1) {	   
			System.out.printf("%s\n", ar[i]);
		}
		//이렇게 하면 데이터 갯수가 나중에 바뀌더라도 수정 안해도 됨.
		
		int x = ar.length;
		for (int i=0; i<x; i=i+1) {	  
			System.out.printf("%s\n", ar[i]);
		}
		//이렇게 하면 ar.length라는 찾아찾아가는 활동을 한번만 해서 시간상의 효율을 높일 수 있음.
		
		//배열에서 [인덱스]를 통해 접근하는 경우, 시작 위치를 찾고, 인덱스만큼 넘어가서 데이터를 찾는 방식입니다.
		//배열의 데이터를 전부 접근할 때는 인덱스를 이용하는 것보다는 빠른 열거를 이용하는 것이 좋다.(for-each)
			/*for(컬렉션의 데이터 1개를 저장할 변수 in 컬렉션){
				수행할 내용
			}
			 =>이렇게 하면 컬렉션의 데이터를 하나씩 변수에 대입하고 괄호 안의 내용을 수행*/
			
			String[] day = {"월","화","수","목","금","토","일"};
			
			for(String temp : day) {
				System.out.printf("%s\n", temp);
			}
		
	}

}
