package com.callor.hello;

public class Class001 {
	
	public static void main(String[] args) {
		
		// 변수와 배열을 선언(예약)만 한 상태
		// 변수나 배열의 값을 읽을 수 없다
		int num;
		int[] nums;
		
		// 변수와 배열을 사용할수 있도록 초기화
		// 이과정을 변수와 배열을 생성한다
		num = 0;
		nums = new int[10];
		
		nums[0] = 100;
		nums[0] = 30;
		
		// 이미 생성, 초기화 되고
		// 데이터가 저장된 배열을
		// 다시 만들면(new int[100]) 
		// 기존에 저장된 모든 데이터는 소멸된다
		nums = new int[100];
		
		
		
	}

}
