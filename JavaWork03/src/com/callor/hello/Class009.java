package com.callor.hello;

public class Class009 {
	public static void main(String[] args) {

		/*
		 * 정수와 정수를 4칙연산을 수행하면
		 * 결과도 정수이다
		 */
		int num1 = 10;
		int num2 = 3;
		System.out.println(num1 / num2);
		
		/*
		 * 정수 / 정수 연산을 수행한 후
		 * 얻어지는 정수를 실수형 변수에 저장
		 */
		float num3 = num1 / num2;
		System.out.println(num3);
		
		/*
		 * 정수를 나눗셈 연산을 수행할때
		 * 정수 / 정수를 수행하면 결과가 정수가 되어
		 * 연산 결과가 오차가 발생한다
		 * 정수 / 정수의 오차 범위를 줄이려면
		 * 정수형 변수에 담긴 값을 실수형(float, double)으로
		 * 각각 변환 한 후 연산을 수행해야 한다. 
		 */
		float num4 = (float)num1 / (float)num2;
		System.out.println(num4);
		
	}
}
