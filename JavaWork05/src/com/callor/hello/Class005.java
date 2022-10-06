package com.callor.hello;

/*
 * Class004 를 참조하여
 * 10명의 성적 배열을 만들고
 * 
 * ======================
 * 성적표
 * ----------------------
 * 1   99
 * 2   77
 * 3   67
 * -----------------------
 * 총점 000
 * 평균 000
 * ========================
 */
public class Class005 {
	
	public static void scorePrint(int[] scores) {
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
	
	public static void main(String[] args) {
		int[] scores = new int[10];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = (int)(Math.random() * 100) + 1;
		}
		scorePrint(scores);
		
	}
	

}
