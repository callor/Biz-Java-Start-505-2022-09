package com.callor.hello;

public class Class017 {
	
	/*
	 * 정수형 배열 50개를 선언하고
	 * 각각의 배열 요소에 1 ~ 100까지 임의 정수중
	 * 한개의 정수를 저장
	 * 
	 * 배열에 저장된 정수중 50 이상의 값이
	 * 최초로 저장된
	 * 배열의 위치는 어디인가?
	 * 
	 */
	public static void main(String[] args) {
		
		int[] nums = new int[50];
		for(int i = 0 ;  i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 100) + 1;
		}
		
		int index = 0;
		for(index = 0 ; index < nums.length ; index++) {
			if(nums[index] >= 50) {
				break;
			}
		}
		if(index < nums.length) {
			System.out.println(index + "번 위치에서 찾음");
		} else {
			System.out.println("찾을 수 없음");
		}
		
	}

}
