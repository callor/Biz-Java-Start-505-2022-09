package com.callor.hello;

public class Class006 {
	
	public static void prime(int num) {
		// num 가 9이면 2 ~ 8까지 반복하기
		for(int i = 2 ; i < num - 1; i++) {
			if(num % i == 0) {
				System.out.println(num 
						+ "는 소수가 아님");
			}
		}
	}
	public static void main(String[] args) {
		prime(5);
		prime(9);
	}
	

}
