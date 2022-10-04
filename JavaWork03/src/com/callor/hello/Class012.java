package com.callor.hello;

public class Class012 {
	
	public static void main(String[] args) {
		// scores 라는 정수형 배열 10개 선언
		// scores 라는 배열 1개를 선언하고 
		// 저장공간을 10개 만들어라
		int[] scores = new int[10];
		
		// ArrayIndexOutOfBound
		// scores 배열은 개수가 10인데
		// 10번 index 에 값을 저장하려고 하니
		// Exception 이 발생한다
		scores[10] = 0;
		
		for(int i = 0 ; i < 10;i++) {
			
		}
		
	}
	

}
