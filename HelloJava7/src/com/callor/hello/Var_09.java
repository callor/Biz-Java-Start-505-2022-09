package com.callor.hello;

public class Var_09 {
	
	/*
	 * 1 ~ 20까지 숫자중 짝수들의 합
	 */
	public static void main(String[] args) {
		
		int sum = 0;
		for(int num = 0 ; num < 20 ; num++) {
			if( (num + 1) % 2 == 0) {
				sum += (num + 1);
			}
		}
		System.out.println(sum);
		
	}

}
