package com.callor.hello;

public class Class03 {
	
	public static void main(String[] args) {
		/*
		 * 1. 정수형변수 num1 을 선언
		 * 2. 0.0 ~ 0.9 까지 중에서 임의 숫자를 만들어라
		 * 		Math.random()
		 * 3. 만들어진 임의 숫자에 10을 곱하라
		 * 		*10
		 * 4. 만들어진 숫자의 소수점을 모두 잘라라
		 * 		(int)
		 * 5. 소수점이 잘린 숫자에 1을 더하라
		 * 		+ 1
		 * 6. 최종결과를 변수 num1 에 저장하라
		 */
		int num1 = (int)(Math.random() * 10)  + 1;
	}

}
