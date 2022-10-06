package com.callor.hello;

public class Class003 {
	
	public static void add(int num1, int num2) {
		System.out.printf("정수 %d 와 정수 %d 의 덧셈 : %d\n",
				num1, num2, num1 + num2);
	}
	public static void add(float num1, float num2) {
		System.out.printf("실수 %f 와 실수 %f 의 덧셈 : %f\n",
				num1, num2, num1 + num2);
	}
	
	/*
	 * 정수형 배열을 nums 매개변수에 전달받아
	 * 배열에 담긴 모든 정수를 덧셈하여
	 * 출력하는 코드
	 */
	public static void add(int[] nums) {
		int sum = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			sum += nums[i];
		}
		System.out.println("배열의 합계 : " + sum);
	}
	
	public static void main(String[] args) {
		add(20,30);
		add(20.0f, 30.0f);
		add(20.01f, 30.01f);
		add(100, 200);
		
		int[] scores = new int[10];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = (int)(Math.random() * 100) + 1;
		}
		add(scores);
		
	}

	
	
}
