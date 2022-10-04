package com.callor.hello;

public class Class007 {
	
	/*
	 * 매개변수로 전달받은 num 변수의 값이
	 * 소수인가 아닌가를 판별하기
	 * 2 ~ (num - 1) 수로 num 를 나누었을때
	 * 중간에 한번이라도 나머지가 0인 경우가 있으면
	 * num 는 소수가 아니다
	 * 중간에 한번이라도 나머지가 0인 경우가 있으면
	 * break 를 만나고 for() 반복문이 중단된다
	 * 이때 index 변수값과 num 변수 값을 비교했을때
	 * index < num 조건이 true 이면 num 변수값은
	 * 소수가 아니다
	 * 그렇지 않으면(else) num 변수값은 소수이다.
	 */
	public static void prime(int num) {
		int index = 0;
		for(index = 2; index < num; index++) {
			if(num % index == 0) {
				break;
			}
		}
		System.out.println(index);
		if(index < num) {
			System.out.println(num + "는 소수가 아님");
		} else {
			System.out.println(num + "는 소수");
		}
	}
	public static void main(String[] args) {
		prime(7);
		prime(9);
	}

}
