package com.callor.hello;

public class Class011 {
	
	public static void main(String[] args) {
		// 정수값 100개를 저장할 배열을 선언하고
		// 이름을 nums 로 지장하겠다
		int[] nums = new int[100];
		
		// nums 배열의 0 ~ 9번까지 위치에
		// 각각 100을 저장하라
		for(int i = 0 ; i < 10 ; i++) {
			nums[i] = 100;
		}
		
		// nums 배열 0 ~ 9까지 저장된 값을
		// 읽어서 sum 변수에 합산하라
		int sum = 0;
		for(int i = 0 ; i < 10 ;i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		
		
	}

}
