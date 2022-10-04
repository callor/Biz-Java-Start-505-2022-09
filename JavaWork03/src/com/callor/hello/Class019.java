package com.callor.hello;

public class Class019 {
	
	/*
	 * 정수형 배열 50개를 선언하고
	 * 각각의 배열 요소에 1 ~ 100까지 임의 정수중
	 * 한개의 정수를 저장
	 * 
	 * 배열에 저장된 정수 중 50 이상의 값이
	 * 몇개인지 Count 하여 출력
	 */
	
	public static void main(String[] args) {
		int[] nums = new int[50];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 100) + 1;
		}
		
		int count = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] >= 50) {
				count++;
			}
		}
		System.out.println("찾은개수 : " + count);
	}
}
