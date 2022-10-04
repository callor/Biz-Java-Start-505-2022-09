package com.callor.hello;

public class Class12 {

	public static void main(String[] args) {
		
		/*
		 * 먼저 num1 변수를 5의 배수가 아닌값으로
		 * 설정
		 * while(조건문)설정
		 * num1 에 임의 정수를 생성
		 */
		int num1 = 1;
		while(num1 % 5 != 0) {
			num1 = (int)(Math.random() * 100) + 1;
			System.out.println(num1);
		}
	}
	
}
