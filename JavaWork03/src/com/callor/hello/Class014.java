package com.callor.hello;

public class Class014 {

	public static void main(String[] args) {
		// 배열을 선언하면
		// 배열에는 length 라는 변수가 내부에
		// 자동으로 생성된다
		// length 변수는 배열의 개수를 담고있는
		// 변수이다
		// 이러한 변수는 properties 라고 부른다
		// properties(속성)
		int[] nums = new int[20];
		
		/*
		 * 배열.length 속성은
		 * 배열을 생성하면 자동으로 개수를
		 * 세어서 저장하고 있다
		 * .length 속성을 사용하여 배열의 index 문제를
		 * 어느정도 해결 할 수 있다.
		 */
		System.out.println("nums 배열의 개수 " 
					+ nums.length);
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = 100;
		}
	}
	
}
