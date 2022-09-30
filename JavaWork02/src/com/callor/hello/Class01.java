package com.callor.hello;


public class Class01 {
	
	/*
	 * 1 ~ 100까지 중에서 임의의 정수 10개를 생성하고
	 * 생성한 정수중 짝수들의 합을 구하여 
	 */
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			int num1 = (int)(Math.random() * 100) + 1;
			if(num1 % 2 == 0) {
				sum += num1;
			}
		}
		System.out.println("짝수의 합 :" + sum);
		
		
	}

}
