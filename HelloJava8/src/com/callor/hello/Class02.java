package com.callor.hello;

public class Class02 {

	public static void main(String[] args) {
		/*
		 * num1 에 일단 10을 저장하고
		 * num1 에 저장된 값에서 5를 제거(뺄셈)
		 * num1 = num1 - 5
		 * 그리고 if() 명령에 의해서 num1 에 저장된값이
		 * 5보다 크면 "5보다 큰 값"이라고 출력하라
		 */
		int num1 = 10;
		num1 -= 5;
		if (num1 > 5) {
			System.out.println("5보다 큰값");
		}
		System.out.println(num1);

	}

}
