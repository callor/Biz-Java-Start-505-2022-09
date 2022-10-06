package com.callor.hello;

/*
 * 정수형 배열 5개를 생성하고
 * 1~100까지 임의 정수를 각 배열 요소에 저장하고
 * 배열에 저장된 정수를
 * 오름차순 순서대로 배열하여 출력
 */
public class Class009 {
	
	public static void main(String[] args) {
		int[] nums = new int[5];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 100) +1; ;
		}
		nums[0] = (int)(Math.random() * 100) +1; ;
		nums[1] = (int)(Math.random() * 100) +1; ;
		nums[2] = (int)(Math.random() * 100) +1; ;
		nums[3] = (int)(Math.random() * 100) +1; ;
		nums[4] = (int)(Math.random() * 100) +1; ;
		
		
	}
	
	

}
