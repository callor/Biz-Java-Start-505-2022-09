package com.callor.hello;

public class Class016 {
	
	/*
	 * 정수형배열 10개를 선언하고
	 * 1 ~ 100까지의 임의의 정수를 생성하여
	 * 각 배열 요소에 저장
	 */
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 100) + 1;
		}
		
		/*
		 * 정수형 배열에 저장된 값중
		 * 짝수만 찾아 출력
		 */
		for(int i = 0 ; i < nums.length ;  i++) {
			if(nums[i] % 2 == 0) {
				System.out.println(nums[i]);
			}
		}
	}


}
