package com.callor.hello;

public class Var_05 {
	
	public static void main(String[] args) {
		/**
		 * 코드는 위에서 아랫방향으로 진행된다
		 * 변수에 연속에서 임의의 값을 저장하고 있는데
		 * 어느 시점에 변수의 값을 읽느냐에 따라
		 * 저장된 값이 다르다
		 */
		int num1;
		num1 = 0;
		num1 = 100;
		System.out.println(num1); // 100 출력
		num1 = 200;
		num1 = 0;
		System.out.println(num1); // 0 출력
	}

}
