package com.callor.hello;

public class Class03 {
	
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
		// num1 과 num2 를 곱한 값이
		// 10 이상이면 "10보다 크다"
		// 라고 출력하기
		if((num1 * num2) > 10) {
			System.out.println("10보다 크다");
		}
		
		// num3 변수를 선언하고
		// num1 나누기 num2 를 저장
		// 결과가 3보다 작으면 "3보다 작다"
		// 라고 출력하기
		int num3 = num1 / num2;
		if(num3 < 3) {
			System.out.println("3보다 작다");
		}
	}
}
