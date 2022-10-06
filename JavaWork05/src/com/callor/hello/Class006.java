package com.callor.hello;

public class Class006 {
	
	public static void main(String[] args) {
		int[] scores = new int[10];
		for(int i = 0 ; i < scores.length ;  i++) {
			scores[i] = (int)(Math.random() * 100) + 1;
		}
		
		/*
		 * ScoreService 클래스를 
		 * scService 라는 이름으로 인스턴스로 생성하고
		 * ( 인스턴스 = 객체 = 객체변수 = object )
		 * print() method 를 사용할 준비하기
		 */
		ScoreService scService = new ScoreService();
		
		// scService 인스턴스를 통하여
		// print() method 호출하기
		scService.print(scores);
		
	}

}
