package com.callor.hello;

public class Class02 {
	public static void main(String[] args) {
		// 배정(밀)도 실수형 변수 num1을 선언하고
		// Math.random() method 를 사용하여
		//  0.0 ~ 0.9 까지 중에서 임의 실수를 만들어
		// num1 에 저장하라
		double num1 = Math.random();
		
		// num1 변수에 10을 곱하여 다시 num1 에 저장
		num1 *= 10; // num1 = num1 * 10;
		
		// 실수형변수 num1 에 담긴 값을
		// 강제로 정수형으로 바꾸어 num2 변수에 저장
		int num2 = (int)num1;
		
		System.out.println(num1);
		System.out.println(num2 + 1);
	}

}
