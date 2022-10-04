package com.callor.hello;

public class Class013 {
	
	public static void main(String[] args) {
		// 만약 nums 배열의 개수를 변경하고자 하면
		// size 변수의 값을 변경하라
		// 그러면 오류가 발생할 확률이 매우 줄어든다
		int size = 100;
		int[] nums = new int[size];
		for(int i = 0 ; i < size ; i++) {
			nums[i] = 100;
		}
	}

}
