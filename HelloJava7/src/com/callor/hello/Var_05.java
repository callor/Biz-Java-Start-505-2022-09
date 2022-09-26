package com.callor.hello;

public class Var_05 {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int num1 = 0 ;num1 < 10;num1++ ) {
			System.out.println(num1 + 1);
		}
		
		sum = 0;
		for(int num1 = 0 ; num1 < 100; num1++) {
			sum += (num1 + 1);
		}
		System.out.println("1 ~ 10까지 덧셈 : " + sum);
	}

}
