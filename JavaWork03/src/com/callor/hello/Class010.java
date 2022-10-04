package com.callor.hello;

/*
 * 7개의 교과목을 저장할 변수를 선언하고
 * 각각 임의의 점수를 저장하고
 * 총점과 평균을 구하시오
 */
public class Class010 {
	
	public static void main(String[] args) {
		/*
		 * 정수형 데이터 10개를 저장할
		 * 연속된 공간을 예약하고
		 * 그 공간에 scores 라는 이름을 붙여라
		 * 정수형 배열 scores 선언하고
		 * 공간을 10개 예약하라
		 */
		int[] scores = new int[10];
		// scores 배열의 0번 ~ 4번 공간에 각각
		// 정수 100을 저장하라
		// 5번 ~ 9번까지 공간에는 0이 채워진 상태
		scores[0] = 100;
		scores[1] = 100;
		scores[2] = 100;
		scores[3] = 100;
		scores[4] = 100;
		
		int sum = scores[0];
		sum += scores[1];
		sum += scores[2];
		sum += scores[3];
		sum += scores[4];
		
		// 배열에 값을 저장할때
		scores[3] = 99;
		
		// 배열에서 값을 읽을때
		System.out.println(scores[3]);
		
		/*
		 * 배열의 index 값은 
		 * 항상 0부터 시작하고
		 * 전체 개수 - 1까지 의 값을 갖는다
		 */
		
	}

}
