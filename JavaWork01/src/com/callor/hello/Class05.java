package com.callor.hello;

public class Class05 {
	
	/*
	 * 0 부터 9까지 중에서 임의 정수 한개를 만들어
	 * num1 변수에 저장하고
	 * num1 변수에 저장된 값이 짝수인가 판별하시오
	 */
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random() * 10);
		if(num1 % 2 == 0) {
			System.out.printf("%d 는 짝수\n",num1);
		}
		
		
	}

}
