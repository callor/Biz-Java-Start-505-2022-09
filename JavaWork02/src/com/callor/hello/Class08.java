package com.callor.hello;

public class Class08 {
	
	public static void main(String[] args) {
		/*
		 * while(조건) {  }
		 * 조건식이 true 인 동안만 반복하여 실행하기
		 */
		int sum = 0;
		int index = 0;
		while(index++ < 10) {
			System.out.println(index);
			sum += index;
		}
		System.out.println(sum);
		
	}

}
