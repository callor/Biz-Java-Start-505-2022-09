package com.callor.hello;

public class Class007 {
	
	public static void main(String[] args) {
		
		// 정수형 배열 scores 를 선언하고
		// {} 의 요소 개수만큼 배열을 생성하고
		// {} 의 요소들을 순서대로 배열의 요소에 저장하라
		int[] scores = {100,90,88,76,78};
		System.out.println(scores[3]);
		
		// sService 객체생성
		// 		ScoreService 클래스를 사용하여
		// 		sService 인스턴스 생성하기
		// 우리가 만든 클래스에 정의된 
		//		method(여기서는 print())를
		//		호출하여 명령을 수행하기 위해서는
		//		먼저 클래스를 인스턴스(객체)로 생성해야 한다
		ScoreService sService = new ScoreService();
		sService.print(scores);
		
		String[] names = {"홍길동","이몽룡","성춘향"};
		sService.print(names);
		
		
	}

}
