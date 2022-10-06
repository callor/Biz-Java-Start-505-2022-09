package com.callor.hello;

/*
 * 앞에서 테스트한 성적표 모양으로
 * 성적표를 출력하고 싶으면
 * ScoreService 클래스를 객체변수 로 생성하고
 * print() method 를 호출하여 자유롭게 사용하라
 * 
 * ScoreService 클래스를 선언하고
 * 도구(JDK)로 만들어 사용할수 있도록 한 것
 * 이 도구에는 print(int[] scores) 라는 메서드가 있고
 * 객체변수.print(정수형배열) 형식으로 호출하면 된다
 */
public class ScoreService {
	
	/*
	 * 문자열 배열을 전달받아
	 * Console 에 출력하기
	 */
	public void print(String[] names) {
		for(int i = 0 ; i < names.length ; i++) {
			System.out.println(names[i]);
		}
	}
	
	/*
	 * 정수형 배열을 전달받아
	 * 성적표를 출력하기
	 */
	public void print(int[] scores) {
		System.out.println("=".repeat(20));
		System.out.println("성적표");
		System.out.println("-".repeat(20));
		int sum = 0 ;
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.printf("%2d\t%5d\n",
					i+1,scores[i] );
			
			sum += scores[i];
			// 반복문 내에서 평균을 계산하면
			// 오차가 발생할 수 있고
			// 불필요한 연산이 계속 수행된다.
			// avg += sum / 개수
			
		}
		
		// 총점이 모두 계산된 후에 평균을 계산
		float avg = (float)sum / (float)scores.length;

		System.out.println("-".repeat(20));
		System.out.printf("총점\t%5d\n",sum);
		System.out.printf("평균\t%5.2f\n",avg);
		System.out.println("=".repeat(20));

	}

}
